package typings.angularMaterial.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object material {
  
  type IColorExpression = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type IIcon = js.Function1[/* id */ java.lang.String, typings.angular.mod.IPromise[typings.std.Element]]
  
  type IMedia = js.Function1[/* media */ java.lang.String, scala.Boolean]
  
  type IStickyService = js.Function3[
    /* scope */ typings.angular.mod.IScope, 
    /* element */ typings.angular.JQuery, 
    /* elementClone */ js.UndefOr[typings.angular.JQuery], 
    scala.Unit
  ]
  
  type ResolveObject = org.scalablytyped.runtime.StringDictionary[
    typings.angular.mod.Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]
  ]
}
