package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OctetString
  extends StObject
     with BaseBlock[LocalOctetStringValueBlock, LocalOctetStringValueBlockJson]
     with _AsnType {
  
  /**
    * Returns OctetString value. If OctetString is constructed, returns concatenated internal OctetString values
    * @returns Array buffer
    * @since 3.0.0
    */
  def getValue(): js.typedarray.ArrayBuffer = js.native
}
