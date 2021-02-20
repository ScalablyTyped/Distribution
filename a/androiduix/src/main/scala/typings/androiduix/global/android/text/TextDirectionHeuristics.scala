package typings.androiduix.global.android.text

import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextDirectionHeuristics")
@js.native
class TextDirectionHeuristics ()
  extends typings.androiduix.android.text.TextDirectionHeuristics
object TextDirectionHeuristics {
  
  @JSGlobal("android.text.TextDirectionHeuristics")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.ANYRTL_LTR")
  @js.native
  def ANYRTL_LTR: TextDirectionHeuristic = js.native
  @scala.inline
  def ANYRTL_LTR_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANYRTL_LTR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
  @js.native
  class AnyStrong protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong {
    def this(lookForRtl: Boolean) = this()
  }
  object AnyStrong {
    
    @JSGlobal("android.text.TextDirectionHeuristics.AnyStrong")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.TextDirectionHeuristics.AnyStrong.INSTANCE_LTR")
    @js.native
    def INSTANCE_LTR: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong = js.native
    @scala.inline
    def INSTANCE_LTR_=(x: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE_LTR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.text.TextDirectionHeuristics.AnyStrong.INSTANCE_RTL")
    @js.native
    def INSTANCE_RTL: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong = js.native
    @scala.inline
    def INSTANCE_RTL_=(x: typings.androiduix.android.text.TextDirectionHeuristics.AnyStrong): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE_RTL")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR")
  @js.native
  def FIRSTSTRONG_LTR: TextDirectionHeuristic = js.native
  @scala.inline
  def FIRSTSTRONG_LTR_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRSTSTRONG_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL")
  @js.native
  def FIRSTSTRONG_RTL: TextDirectionHeuristic = js.native
  @scala.inline
  def FIRSTSTRONG_RTL_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRSTSTRONG_RTL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.TextDirectionHeuristics.FirstStrong")
  @js.native
  class FirstStrong ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.FirstStrong
  object FirstStrong {
    
    @JSGlobal("android.text.TextDirectionHeuristics.FirstStrong")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.TextDirectionHeuristics.FirstStrong.INSTANCE")
    @js.native
    def INSTANCE: typings.androiduix.android.text.TextDirectionHeuristics.FirstStrong = js.native
    @scala.inline
    def INSTANCE_=(x: typings.androiduix.android.text.TextDirectionHeuristics.FirstStrong): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.LOCALE")
  @js.native
  def LOCALE: TextDirectionHeuristic = js.native
  @scala.inline
  def LOCALE_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.LTR")
  @js.native
  def LTR: TextDirectionHeuristic = js.native
  @scala.inline
  def LTR_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.RTL")
  @js.native
  def RTL: TextDirectionHeuristic = js.native
  @scala.inline
  def RTL_=(x: TextDirectionHeuristic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.STATE_FALSE")
  @js.native
  def STATE_FALSE: js.Any = js.native
  @scala.inline
  def STATE_FALSE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_FALSE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.STATE_TRUE")
  @js.native
  def STATE_TRUE: js.Any = js.native
  @scala.inline
  def STATE_TRUE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_TRUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.STATE_UNKNOWN")
  @js.native
  def STATE_UNKNOWN: js.Any = js.native
  @scala.inline
  def STATE_UNKNOWN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_UNKNOWN")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl")
  @js.native
  abstract class TextDirectionHeuristicImpl protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl {
    def this(algorithm: TextDirectionAlgorithm) = this()
  }
  
  @JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicInternal")
  @js.native
  class TextDirectionHeuristicInternal protected ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicInternal {
    def this(algorithm: TextDirectionAlgorithm, defaultIsRtl: Boolean) = this()
  }
  
  @JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale")
  @js.native
  class TextDirectionHeuristicLocale ()
    extends typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale
  object TextDirectionHeuristicLocale {
    
    @JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale.INSTANCE")
    @js.native
    def INSTANCE: typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale = js.native
    @scala.inline
    def INSTANCE_=(x: typings.androiduix.android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.isRtlText")
  @js.native
  def isRtlText(directionality: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextDirectionHeuristics.isRtlTextOrFormat")
  @js.native
  def isRtlTextOrFormat(directionality: js.Any): js.Any = js.native
}
