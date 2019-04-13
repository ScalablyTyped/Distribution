package typings
package angularDashAgilityLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aaNs {
  type IFieldGroupStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* element */ angularLib.angularMod.IAugmentedJQueryStatic, scala.Unit]
  ]
  type IGlobalSettings = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ILabelStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* element */ angularLib.angularMod.IAugmentedJQueryStatic, 
      /* labelText */ java.lang.String, 
      /* isRequired */ scala.Boolean, 
      scala.Unit
    ]
  ]
  type INotifyPredicate = js.Function3[/* message */ java.lang.String, /* options */ js.Any, /* notifier */ js.Any, js.Any]
  type IOnNavigateAwayStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* rootFormScope */ angularLib.angularMod.IScope, 
      /* rootForm */ angularLib.angularMod.IAugmentedJQueryStatic, 
      /* $injector */ angularLib.angularMod.autoNs.IInjectorService, 
      scala.Unit
    ]
  ]
  type ISpinnerClickStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* element */ angularLib.angularMod.IAugmentedJQueryStatic, scala.Unit]
  ]
  type IValMsgPlacementStrategies = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* formFieldElement */ angularLib.angularMod.IAugmentedJQueryStatic, 
      /* formName */ java.lang.String, 
      /* formFieldName */ java.lang.String, 
      scala.Unit
    ]
  ]
  type IValidationMessages = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
