package typings.angularFormly.AngularFormly

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * see http://docs.angular-formly.com/docs/formly-expressions#expressionproperties-validators--messages
  */
type IExpressionFunction = js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, Any]

type IFieldArray = js.Array[IFieldConfigurationObject | IFieldGroup]

type ITemplateManipulator = js.Function3[
/* template */ String | HTMLElement, 
/* options */ js.Object, 
/* scope */ ITemplateScope, 
String | HTMLElement]
