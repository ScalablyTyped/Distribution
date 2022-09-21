package typings.antvScale

import typings.antvScale.findTickIntervalMod.TickInterval
import typings.antvScale.timeIntervalMod.Interval
import typings.antvScale.timeIntervalMod.IntervalMap
import typings.antvScale.typesMod.CreateTransform
import typings.antvScale.typesMod.Interpolate
import typings.antvScale.typesMod.Interpolator
import typings.antvScale.typesMod.NiceMethod
import typings.antvScale.typesMod.TickMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@antv/scale/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_DAY")
  @js.native
  val DURATION_DAY: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_HOUR")
  @js.native
  val DURATION_HOUR: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_MINUTE")
  @js.native
  val DURATION_MINUTE: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_MONTH")
  @js.native
  val DURATION_MONTH: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_SECOND")
  @js.native
  val DURATION_SECOND: /* 1000 */ Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_WEEK")
  @js.native
  val DURATION_WEEK: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "DURATION_YEAR")
  @js.native
  val DURATION_YEAR: Double = js.native
  
  @JSImport("@antv/scale/lib/utils", "InternMap")
  @js.native
  open class InternMap[K, V] protected ()
    extends typings.antvScale.internMapMod.InternMap[K, V] {
    def this(entries: Any) = this()
  }
  
  inline def bisect(array: js.Array[Any], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Double, hi: Double, getter: js.Function1[/* any */ Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Double, hi: Unit, getter: js.Function1[/* any */ Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Unit, hi: Double, getter: js.Function1[/* any */ Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: js.Array[Any], x: Double, lo: Unit, hi: Unit, getter: js.Function1[/* any */ Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def chooseNiceTimeMask(date: js.Date, intervalMap: IntervalMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseNiceTimeMask")(date.asInstanceOf[js.Any], intervalMap.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compose[T](fn: js.Function1[/* x */ T, T], rest: (js.Function1[/* x */ T, T])*): js.Function1[/* x */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(List(fn.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* x */ T, T]]
  
  inline def createClamp(a: Double, b: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClamp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @JSImport("@antv/scale/lib/utils", "createInterpolateColor")
  @js.native
  val createInterpolateColor: Interpolate[String] = js.native
  
  @JSImport("@antv/scale/lib/utils", "createInterpolateNumber")
  @js.native
  val createInterpolateNumber: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils", "createInterpolateRound")
  @js.native
  val createInterpolateRound: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils", "createInterpolateValue")
  @js.native
  val createInterpolateValue: Interpolate[Double | String] = js.native
  
  inline def createNormalize(a: Double, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNormalize")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  @JSImport("@antv/scale/lib/utils", "d3LinearNice")
  @js.native
  val d3LinearNice: NiceMethod[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils", "d3LogNice")
  @js.native
  val d3LogNice: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale/lib/utils", "d3TimeNice")
  @js.native
  val d3TimeNice: NiceMethod[js.Date] = js.native
  
  @JSImport("@antv/scale/lib/utils", "day")
  @js.native
  val day: Interval = js.native
  
  inline def findTickInterval(start: js.Date, stop: js.Date, count: Double, interval: Double, utc: Boolean): TickInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("findTickInterval")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[TickInterval]
  
  @JSImport("@antv/scale/lib/utils", "hour")
  @js.native
  val hour: Interval = js.native
  
  inline def interpolatize(
    rangeOf: js.Function1[/* interpolator */ Interpolator, js.Array[Double]],
    normalizeDomain: CreateTransform
  ): js.Function1[/* Scale */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatize")(rangeOf.asInstanceOf[js.Any], normalizeDomain.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Scale */ Any, Unit]]
  
  inline def isValid(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@antv/scale/lib/utils", "localIntervalMap")
  @js.native
  val localIntervalMap: IntervalMap = js.native
  
  inline def logs(base: Double, shouldReflect: Boolean): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("logs")(base.asInstanceOf[js.Any], shouldReflect.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @JSImport("@antv/scale/lib/utils", "millisecond")
  @js.native
  val millisecond: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "minute")
  @js.native
  val minute: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "month")
  @js.native
  val month: Interval = js.native
  
  inline def pows(base: Double, shouldReflect: Boolean): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pows")(base.asInstanceOf[js.Any], shouldReflect.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
  
  @JSImport("@antv/scale/lib/utils", "second")
  @js.native
  val second: Interval = js.native
  
  inline def tickIncrement(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickIncrement")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tickStep(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickStep")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@antv/scale/lib/utils", "utcDay")
  @js.native
  val utcDay: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcHour")
  @js.native
  val utcHour: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcIntervalMap")
  @js.native
  val utcIntervalMap: IntervalMap = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcMillisecond")
  @js.native
  val utcMillisecond: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcMinute")
  @js.native
  val utcMinute: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcMonth")
  @js.native
  val utcMonth: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcSecond")
  @js.native
  val utcSecond: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcWeek")
  @js.native
  val utcWeek: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "utcYear")
  @js.native
  val utcYear: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "week")
  @js.native
  val week: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils", "year")
  @js.native
  val year: Interval = js.native
}
