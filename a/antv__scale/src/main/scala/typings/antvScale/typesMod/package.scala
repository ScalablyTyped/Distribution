package typings.antvScale.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Comparator = js.Function2[/* a */ Any, /* b */ Any, Double]

type Domain[O /* <: BaseOptions */] = /* import warning: importer.ImportType#apply Failed type conversion: O['domain'][number] */ js.Any

type Interpolate[T] = js.Function2[/* a */ T, /* b */ T, js.Function1[/* t */ Double, T]]

type Interpolates = Interpolate[Double | String]

type Interpolator = js.Function1[/* t */ Double, Any]

type NiceMethod[T] = TickMethod[T]

type Range[O /* <: BaseOptions */] = /* import warning: importer.ImportType#apply Failed type conversion: O['range'][number] */ js.Any

type SqrtOptions = LinearOptions

type TickMethodOptions[T] = js.Tuple5[T, T, Double, js.UndefOr[Double], js.UndefOr[Boolean]]

type Transform = js.Function1[/* x */ Any, Any]

type Unknown[O /* <: BaseOptions */] = /* import warning: importer.ImportType#apply Failed type conversion: O['unknown'] */ js.Any
