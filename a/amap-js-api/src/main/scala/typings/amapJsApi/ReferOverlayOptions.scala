package typings.amapJsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  O extends amap-js-api.AMap.BezierCurve<any> ? amap-js-api.AMap.BezierCurve.Options<any> : O extends amap-js-api.AMap.Polyline<any> ? amap-js-api.AMap.Polyline.Options<any> : O extends amap-js-api.AMap.Circle<any> ? amap-js-api.AMap.Circle.Options<any> : O extends amap-js-api.AMap.Ellipse<any> ? amap-js-api.AMap.Ellipse.Options<any> : O extends amap-js-api.AMap.Polygon<any> ? amap-js-api.AMap.Polygon.Options<any> : O extends amap-js-api.AMap.Text<any> ? amap-js-api.AMap.Text.Options : O extends amap-js-api.AMap.Marker<any> ? amap-js-api.AMap.Marker.Options<any> : O extends amap-js-api.AMap.Rectangle<any> ? amap-js-api.AMap.Rectangle.Options<any> : any
  }}}
  */
@js.native
trait ReferOverlayOptions[O] extends StObject
