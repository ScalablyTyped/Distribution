package typings.amapJsApi.AMap

import typings.amapJsApi.anon.Lnglat
import typings.amapJsApi.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * 圆点标记
  */
type CircleMarker[ExtraData] = Circle[ExtraData]

type Event_[N /* <: String */, V] = Type[N] & (/* import warning: importer.ImportType#apply Failed type conversion: V extends std.HTMLElement ? {  value :V} : V extends object ? V : V extends undefined ? {} : {  value :V} */ js.Any)

type LocationValue = LngLat | (js.Tuple2[Double, Double])

type MapsEvent[N /* <: String */, I] = Event_[N, Lnglat[I]]

type MarkerShape = EventEmitter

type Merge[O, T] = O & T

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
  }}}
  */
type Omit[T, E /* <: /* keyof T */ String */] = T

type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any

type SizeValue = Size | (js.Tuple2[Double, Double])

type View2D = EventEmitter
