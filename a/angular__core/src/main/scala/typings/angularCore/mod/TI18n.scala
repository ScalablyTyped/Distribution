package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Store information for the i18n translation block.
  */
trait TI18n extends StObject {
  
  /**
    * A set of OpCodes which will create the Text Nodes and ICU anchors for the translation blocks.
    *
    * NOTE: The ICU anchors are filled in with ICU Update OpCode.
    */
  var create: I18nCreateOpCodes
  
  /**
    * A set of OpCodes which will be executed on each change detection to determine if any changes to
    * DOM are required.
    */
  var update: I18nUpdateOpCodes
}
object TI18n {
  
  inline def apply(create: I18nCreateOpCodes, update: I18nUpdateOpCodes): TI18n = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TI18n]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TI18n] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: I18nCreateOpCodes): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: I18nUpdateOpCodes): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
