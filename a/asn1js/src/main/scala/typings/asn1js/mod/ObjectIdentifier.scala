package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdentifier
  extends StObject
     with BaseBlock[LocalObjectIdentifierValueBlock, LocalObjectIdentifierValueBlockJson]
     with _AsnType {
  
  /**
    * Gets string representation of Object Identifier
    * @since 3.0.0
    */
  def getValue(): String = js.native
  
  /**
    * Sets Object Identifier value from string
    * @param value String value
    * @since 3.0.0
    */
  def setValue(value: String): Unit = js.native
}
