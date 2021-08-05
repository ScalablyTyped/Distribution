package typings.angularForms

import typings.angularForms.angularFormsStrings.always
import typings.angularForms.angularFormsStrings.never
import typings.angularForms.angularFormsStrings.once
import typings.angularForms.mod.FormHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var emitEvent: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
      
      inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
    }
  }
  
  trait EmitEvent extends StObject {
    
    var emitEvent: js.UndefOr[Boolean] = js.undefined
    
    var onlySelf: js.UndefOr[Boolean] = js.undefined
  }
  object EmitEvent {
    
    inline def apply(): EmitEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmitEvent]
    }
    
    extension [Self <: EmitEvent](x: Self) {
      
      inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
      
      inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
      
      inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
      
      inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
    }
  }
  
  trait EmitModelToViewChange extends StObject {
    
    var emitEvent: js.UndefOr[Boolean] = js.undefined
    
    var emitModelToViewChange: js.UndefOr[Boolean] = js.undefined
    
    var emitViewToModelChange: js.UndefOr[Boolean] = js.undefined
    
    var onlySelf: js.UndefOr[Boolean] = js.undefined
  }
  object EmitModelToViewChange {
    
    inline def apply(): EmitModelToViewChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmitModelToViewChange]
    }
    
    extension [Self <: EmitModelToViewChange](x: Self) {
      
      inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
      
      inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
      
      inline def setEmitModelToViewChange(value: Boolean): Self = StObject.set(x, "emitModelToViewChange", value.asInstanceOf[js.Any])
      
      inline def setEmitModelToViewChangeUndefined: Self = StObject.set(x, "emitModelToViewChange", js.undefined)
      
      inline def setEmitViewToModelChange(value: Boolean): Self = StObject.set(x, "emitViewToModelChange", value.asInstanceOf[js.Any])
      
      inline def setEmitViewToModelChangeUndefined: Self = StObject.set(x, "emitViewToModelChange", js.undefined)
      
      inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
      
      inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var updateOn: js.UndefOr[FormHooks] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setUpdateOn(value: FormHooks): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    }
  }
  
  trait OnlySelf extends StObject {
    
    var onlySelf: js.UndefOr[Boolean] = js.undefined
  }
  object OnlySelf {
    
    inline def apply(): OnlySelf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnlySelf]
    }
    
    extension [Self <: OnlySelf](x: Self) {
      
      inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
      
      inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
    }
  }
  
  trait UpdateOn extends StObject {
    
    var updateOn: js.UndefOr[FormHooks] = js.undefined
  }
  object UpdateOn {
    
    inline def apply(): UpdateOn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOn]
    }
    
    extension [Self <: UpdateOn](x: Self) {
      
      inline def setUpdateOn(value: FormHooks): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    }
  }
  
  trait WarnOnNgModelWithFormControl extends StObject {
    
    /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always
  }
  object WarnOnNgModelWithFormControl {
    
    inline def apply(warnOnNgModelWithFormControl: never | once | always): WarnOnNgModelWithFormControl = {
      val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[WarnOnNgModelWithFormControl]
    }
    
    extension [Self <: WarnOnNgModelWithFormControl](x: Self) {
      
      inline def setWarnOnNgModelWithFormControl(value: never | once | always): Self = StObject.set(x, "warnOnNgModelWithFormControl", value.asInstanceOf[js.Any])
    }
  }
}
