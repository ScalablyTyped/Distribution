package typings.antDesignProUtils.anon

import typings.antDesignProUtils.esUseEditableArrayMod.SaveEditableActionRef
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Save[T] extends StObject {
  
  var cancel: Element
  
  var delete: js.UndefOr[Element] = js.undefined
  
  var save: Element
  
  var saveRef: RefObject[SaveEditableActionRef[T]]
}
object Save {
  
  inline def apply[T](cancel: Element, save: Element, saveRef: RefObject[SaveEditableActionRef[T]]): Save[T] = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], saveRef = saveRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Save[T]]
  }
  
  extension [Self <: Save[?], T](x: Self & Save[T]) {
    
    inline def setCancel(value: Element): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Element): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setSave(value: Element): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveRef(value: RefObject[SaveEditableActionRef[T]]): Self = StObject.set(x, "saveRef", value.asInstanceOf[js.Any])
  }
}
