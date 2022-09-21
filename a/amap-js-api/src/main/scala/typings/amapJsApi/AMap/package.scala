package typings.amapJsApi.AMap

import org.scalablytyped.runtime.TopLevel
import typings.amapJsApi.anon.Lnglat
import typings.amapJsApi.anon.Type
import typings.amapJsApi.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * 圆点标记
  */
type CircleMarker[ExtraData] = Circle[ExtraData]

type Event_[N /* <: String */, V] = Type[N] & (Value[V] | js.Object | V)

type LocationValue = LngLat | (js.Tuple2[Double, Double])

type MapsEvent[N /* <: String */, I] = Event_[N, Lnglat[I]]

type MarkerShape = EventEmitter

type Merge[O, T] = O & T

type Omit[T, E /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in std.Exclude<keyof T, E> ]: T[K]}
  */ typings.amapJsApi.amapJsApiStrings.Omit & TopLevel[T]

type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any

type SizeValue = Size | (js.Tuple2[Double, Double])

type View2D = EventEmitter
