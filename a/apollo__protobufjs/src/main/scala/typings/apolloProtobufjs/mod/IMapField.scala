package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapField extends IField {
  
  /** Key type */
  var keyType: String = js.native
}
object IMapField {
  
  @scala.inline
  def apply(id: Double, keyType: String, `type`: String): IMapField = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapField]
  }
  
  @scala.inline
  implicit class IMapFieldMutableBuilder[Self <: IMapField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
  }
}
