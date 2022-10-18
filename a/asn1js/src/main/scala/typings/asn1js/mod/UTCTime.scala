package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UTCTime
  extends StObject
     with LocalSimpleStringBlock
     with IUTCTime
     with IDateConvertible
     with _AsnType {
  
  /**
    * Function converting ASN.1 internal string into ArrayBuffer
    * @returns
    */
  def toBuffer(): js.typedarray.ArrayBuffer = js.native
  
  def toString(encoding: DateStringEncoding): String = js.native
}
