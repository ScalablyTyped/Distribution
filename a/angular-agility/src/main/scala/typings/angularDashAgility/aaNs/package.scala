package typings.angularDashAgility

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IAugmentedJQueryStatic
import typings.angular.angularMod.IScope
import typings.angular.angularMod.autoNs.IInjectorService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aaNs {
  type IFieldGroupStrategies = StringDictionary[js.Function1[/* element */ IAugmentedJQueryStatic, Unit]]
  type IGlobalSettings = StringDictionary[js.Any]
  type ILabelStrategies = StringDictionary[
    js.Function3[
      /* element */ IAugmentedJQueryStatic, 
      /* labelText */ String, 
      /* isRequired */ Boolean, 
      Unit
    ]
  ]
  type INotifyPredicate = js.Function3[/* message */ String, /* options */ js.Any, /* notifier */ js.Any, js.Any]
  type IOnNavigateAwayStrategies = StringDictionary[
    js.Function3[
      /* rootFormScope */ IScope, 
      /* rootForm */ IAugmentedJQueryStatic, 
      /* $injector */ IInjectorService, 
      Unit
    ]
  ]
  type ISpinnerClickStrategies = StringDictionary[js.Function1[/* element */ IAugmentedJQueryStatic, Unit]]
  type IValMsgPlacementStrategies = StringDictionary[
    js.Function3[
      /* formFieldElement */ IAugmentedJQueryStatic, 
      /* formName */ String, 
      /* formFieldName */ String, 
      Unit
    ]
  ]
  type IValidationMessages = StringDictionary[String]
}
