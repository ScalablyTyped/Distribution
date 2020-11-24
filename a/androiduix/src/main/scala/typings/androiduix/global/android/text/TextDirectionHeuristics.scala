package typings.androiduix.global.android.text

import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextDirectionHeuristics")
@js.native
class TextDirectionHeuristics ()
  extends typings.androiduix.android.text.TextDirectionHeuristics
/* static members */
@JSGlobal("android.text.TextDirectionHeuristics")
@js.native
object TextDirectionHeuristics extends js.Object {
  
  var ANYRTL_LTR: TextDirectionHeuristic = js.native
  
  var FIRSTSTRONG_LTR: TextDirectionHeuristic = js.native
  
  var FIRSTSTRONG_RTL: TextDirectionHeuristic = js.native
  
  var LOCALE: TextDirectionHeuristic = js.native
  
  var LTR: TextDirectionHeuristic = js.native
  
  var RTL: TextDirectionHeuristic = js.native
  
  var STATE_FALSE: js.Any = js.native
  
  var STATE_TRUE: js.Any = js.native
  
  var STATE_UNKNOWN: js.Any = js.native
  
  /* private */ def isRtlText(directionality: js.Any): js.Any = js.native
  
  /* private */ def isRtlTextOrFormat(directionality: js.Any): js.Any = js.native
  
  @js.native
  class AnyStrong protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong {
    def this(lookForRtl: Boolean) = this()
  }
  /* static members */
  @js.native
  object AnyStrong extends js.Object {
    
    var INSTANCE_LTR: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong = js.native
    
    var INSTANCE_RTL: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong = js.native
  }
  
  @js.native
  class FirstStrong ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.FirstStrong
  /* static members */
  @js.native
  object FirstStrong extends js.Object {
    
    var INSTANCE: typings.androiduix.android.text.TextDirectionHeuristics.FirstStrong = js.native
  }
  
  @js.native
  abstract class TextDirectionHeuristicImpl protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl {
    def this(algorithm: TextDirectionAlgorithm) = this()
  }
  
  @js.native
  class TextDirectionHeuristicInternal protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicInternal {
    def this(algorithm: TextDirectionAlgorithm, defaultIsRtl: Boolean) = this()
  }
  
  @js.native
  class TextDirectionHeuristicLocale ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale
  /* static members */
  @js.native
  object TextDirectionHeuristicLocale extends js.Object {
    
    var INSTANCE: typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale = js.native
  }
}
