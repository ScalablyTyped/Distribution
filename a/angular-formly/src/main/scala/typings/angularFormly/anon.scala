package typings.angularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angularFormly.AngularFormly.IExpressionFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var attribute: js.UndefOr[js.Any] = js.undefined
    
    var bound: js.UndefOr[js.Any] = js.undefined
    
    var expression: js.UndefOr[js.Any] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setAttribute(value: js.Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setBound(value: js.Any): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      inline def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ErrorExistsAndShouldBeVisible extends StObject {
    
    /**
      * This is set by angular-formly. This is a boolean indicating whether an error message should be shown. Because
      * you generally only want to show error messages when the user has interacted with a specific field, this value
      * is set to true based on this rule: field invalid && (field touched || validation.show) (with slight difference
      * for pre-angular 1.3 because it doesn't have touched support).
      */
    var errorExistsAndShouldBeVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A map of Formly Expressions mapped to message names. This is really useful when you're using ng-messages
      * like in this example.
      */
    var messages: js.UndefOr[StringDictionary[IExpressionFunction | String]] = js.undefined
    
    /**
      * A boolean you as the developer can set to specify to force options.validation.errorExistsAndShouldBeVisible
      * to be set to true when there are $errors. This is useful when you're trying to call the user's attention to
      * some fields for some reason.
      */
    var show: js.UndefOr[Boolean] = js.undefined
  }
  object ErrorExistsAndShouldBeVisible {
    
    inline def apply(): ErrorExistsAndShouldBeVisible = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorExistsAndShouldBeVisible]
    }
    
    extension [Self <: ErrorExistsAndShouldBeVisible](x: Self) {
      
      inline def setErrorExistsAndShouldBeVisible(value: Boolean): Self = StObject.set(x, "errorExistsAndShouldBeVisible", value.asInstanceOf[js.Any])
      
      inline def setErrorExistsAndShouldBeVisibleUndefined: Self = StObject.set(x, "errorExistsAndShouldBeVisible", js.undefined)
      
      inline def setMessages(value: StringDictionary[IExpressionFunction | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
