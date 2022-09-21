package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IColorExpression = StringDictionary[String]

type IIcon = js.Function1[/* id */ String, IPromise[Element]]

type IMedia = js.Function1[/* media */ String, Boolean]

type IStickyService = js.Function3[/* scope */ IScope, /* element */ JQuery, /* elementClone */ js.UndefOr[JQuery], Unit]

type ResolveObject = StringDictionary[Injectable[js.Function1[/* repeated */ Any, js.Thenable[Any]]]]
