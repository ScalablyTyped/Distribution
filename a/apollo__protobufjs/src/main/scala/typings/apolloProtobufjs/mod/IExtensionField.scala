package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtensionField
  extends StObject
     with IField
     with AnyExtensionField {
  
  /** Extended type */
  var extend: String
}
object IExtensionField {
  
  @scala.inline
  def apply(extend: String, id: Double, `type`: String): IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionField]
  }
  
  @scala.inline
  implicit class IExtensionFieldMutableBuilder[Self <: IExtensionField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
