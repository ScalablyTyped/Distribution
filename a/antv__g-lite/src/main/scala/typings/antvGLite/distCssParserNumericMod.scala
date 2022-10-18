package typings.antvGLite

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserNumericMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/numeric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clampedMergeNumbers(min: Double, max: Double): js.Function2[
    /* left */ Double, 
    /* right */ Double, 
    js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampedMergeNumbers")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* left */ Double, 
    /* right */ Double, 
    js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]
  ]]
  
  inline def mergeNumberLists(left: js.Array[Double], right: js.Array[Double]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumberLists")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
    ]
  ]]
  
  inline def mergeNumbers(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumbers")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]]
  
  inline def numberToString(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object parseNumber {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/numeric", "parseNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/numeric", "parseNumber.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object parseNumberList {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/numeric", "parseNumberList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/numeric", "parseNumberList.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
}
