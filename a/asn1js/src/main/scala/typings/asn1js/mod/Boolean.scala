package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boolean
  extends StObject
     with BaseBlock[LocalBooleanValueBlock, LocalBooleanValueBlockJson]
     with _AsnType {
  
  /**
    * Gets value
    * @since 3.0.0
    */
  def getValue(): scala.Boolean = js.native
  
  /**
    * Sets value
    * @param value Boolean value
    * @since 3.0.0
    */
  def setValue(value: scala.Boolean): Unit = js.native
}
