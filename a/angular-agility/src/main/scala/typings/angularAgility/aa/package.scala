package typings.angularAgility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aa {
  type IFieldGroupStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* element */ typings.angular.mod.IAugmentedJQueryStatic, scala.Unit]
  ]
  type IGlobalSettings = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ILabelStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* element */ typings.angular.mod.IAugmentedJQueryStatic, 
      /* labelText */ java.lang.String, 
      /* isRequired */ scala.Boolean, 
      scala.Unit
    ]
  ]
  type INotifyPredicate = js.Function3[/* message */ java.lang.String, /* options */ js.Any, /* notifier */ js.Any, js.Any]
  type IOnNavigateAwayStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* rootFormScope */ typings.angular.mod.IScope, 
      /* rootForm */ typings.angular.mod.IAugmentedJQueryStatic, 
      /* $injector */ typings.angular.mod.auto.IInjectorService, 
      scala.Unit
    ]
  ]
  type ISpinnerClickStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* element */ typings.angular.mod.IAugmentedJQueryStatic, scala.Unit]
  ]
  type IValMsgPlacementStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* formFieldElement */ typings.angular.mod.IAugmentedJQueryStatic, 
      /* formName */ java.lang.String, 
      /* formFieldName */ java.lang.String, 
      scala.Unit
    ]
  ]
  type IValidationMessages = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
