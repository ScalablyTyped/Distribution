package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantileMod {
  
  @JSImport("@antv/g2plot/lib/utils/transform/quantile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def quantile(x: js.Array[Double], p: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  /**
    * The [quantile](https://en.wikipedia.org/wiki/Quantile):
    * this is a population quantile, since we assume to know the entire
    * dataset in this library. This is an implementation of the
    * [Quantiles of a Population](http://en.wikipedia.org/wiki/Quantile#Quantiles_of_a_population)
    * algorithm from wikipedia.
    *
    * Sample is a one-dimensional array of numbers,
    * and p is either a decimal number from 0 to 1 or an array of decimal
    * numbers from 0 to 1.
    * In terms of a k/q quantile, p = k/q - it's just dealing with fractions or dealing
    * with decimal values.
    * When p is an array, the result of the function is also an array containing the appropriate
    * quantiles in input order
    *
    * @param {Array<number>} x sample of one or more numbers
    * @param {Array<number> | number} p the desired quantile, as a number between 0 and 1
    * @returns {number} quantile
    * @example
    * quantile([3, 6, 7, 8, 8, 9, 10, 13, 15, 16, 20], 0.5); // => 9
    */
  inline def quantile(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantileSorted(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quickselect(arr: js.Array[Double], k: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def quickselect(arr: js.Array[Double], k: Any, left: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def quickselect(arr: js.Array[Double], k: Any, left: Double, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def quickselect(arr: js.Array[Double], k: Any, left: Unit, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(arr.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def swap[T](arr: js.Array[T], i: Double, j: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(arr.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
