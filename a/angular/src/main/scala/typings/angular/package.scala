package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object angular {
  
  type JQLiteCssProperties = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | typings.angular.cssPropertySetter]
  
  type JQueryStatic = js.Function1[
    /* element */ java.lang.String | typings.std.Element | typings.std.Document | typings.std.Window | typings.angular.JQuery | typings.std.ArrayLike[typings.std.Element] | js.Function0[scala.Unit], 
    typings.angular.JQLite
  ]
  
  /**
    * The interface used to specify the properties parameter in css()
    */
  // tslint:disable-next-line:class-name
  type cssPropertySetter = js.Function2[
    /* index */ scala.Double, 
    /* value */ js.UndefOr[java.lang.String], 
    java.lang.String | scala.Double
  ]
}
