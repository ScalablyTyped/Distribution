package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeObjectIdentifier
  extends StObject
     with BaseBlock[
      LocalRelativeObjectIdentifierValueBlock, 
      LocalRelativeObjectIdentifierValueBlockJson
    ]
     with _AsnType {
  
  /**
    * Gets string representation of Relative Object Identifier
    * @since 3.0.0
    */
  def getValue(): String = js.native
  
  /**
    * Sets Relative Object Identifier value from string
    * @param value String value
    * @since 3.0.0
    */
  def setValue(value: String): Unit = js.native
}
