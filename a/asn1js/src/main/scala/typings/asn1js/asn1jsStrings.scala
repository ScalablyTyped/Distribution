package typings.asn1js

import typings.asn1js.mod.DateStringEncoding
import typings.asn1js.mod.StringEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asn1jsStrings {
  
  @js.native
  sealed trait ascii
    extends StObject
       with DateStringEncoding
       with StringEncoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait hex
    extends StObject
       with DateStringEncoding
       with StringEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait iso
    extends StObject
       with DateStringEncoding
  inline def iso: iso = "iso".asInstanceOf[iso]
}
