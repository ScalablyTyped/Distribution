package typings.aceDiff

import typings.aceDiff.aceDiffStrings.broad
import typings.aceDiff.aceDiffStrings.specific
import typings.aceDiff.anon.Connector
import typings.aceDiff.anon.Left
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ace-diff", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with AceDiff {
    def this(opts: AceDiffConstructorOpts) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def diff(): Unit = js.native
    
    /* CompleteClass */
    override def getEditors(): Left = js.native
    
    /* CompleteClass */
    override def getNumDiffs(): Double = js.native
    
    /* CompleteClass */
    override def setOptions(options: AceDiffOpts): Unit = js.native
  }
  
  trait AceDiff extends StObject {
    
    def destroy(): Unit
    
    def diff(): Unit
    
    def getEditors(): Left
    
    def getNumDiffs(): Double
    
    def setOptions(options: AceDiffOpts): Unit
  }
  object AceDiff {
    
    inline def apply(
      destroy: () => Unit,
      diff: () => Unit,
      getEditors: () => Left,
      getNumDiffs: () => Double,
      setOptions: AceDiffOpts => Unit
    ): AceDiff = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), diff = js.Any.fromFunction0(diff), getEditors = js.Any.fromFunction0(getEditors), getNumDiffs = js.Any.fromFunction0(getNumDiffs), setOptions = js.Any.fromFunction1(setOptions))
      __obj.asInstanceOf[AceDiff]
    }
    
    extension [Self <: AceDiff](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDiff(value: () => Unit): Self = StObject.set(x, "diff", js.Any.fromFunction0(value))
      
      inline def setGetEditors(value: () => Left): Self = StObject.set(x, "getEditors", js.Any.fromFunction0(value))
      
      inline def setGetNumDiffs(value: () => Double): Self = StObject.set(x, "getNumDiffs", js.Any.fromFunction0(value))
      
      inline def setSetOptions(value: AceDiffOpts => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    }
  }
  
  trait AceDiffConstructorOpts
    extends StObject
       with AceDiffOpts {
    
    var element: String | HTMLElement
    
    @JSName("left")
    var left_AceDiffConstructorOpts: AceDiffLROpts
    
    @JSName("right")
    var right_AceDiffConstructorOpts: AceDiffLROpts
  }
  object AceDiffConstructorOpts {
    
    inline def apply(element: String | HTMLElement, left: AceDiffLROpts, right: AceDiffLROpts): AceDiffConstructorOpts = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[AceDiffConstructorOpts]
    }
    
    extension [Self <: AceDiffConstructorOpts](x: Self) {
      
      inline def setElement(value: String | HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: AceDiffLROpts): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: AceDiffLROpts): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait AceDiffLROpts extends StObject {
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    var copyLinkEnabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object AceDiffLROpts {
    
    inline def apply(): AceDiffLROpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AceDiffLROpts]
    }
    
    extension [Self <: AceDiffLROpts](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCopyLinkEnabled(value: Boolean): Self = StObject.set(x, "copyLinkEnabled", value.asInstanceOf[js.Any])
      
      inline def setCopyLinkEnabledUndefined: Self = StObject.set(x, "copyLinkEnabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait AceDiffOpts extends StObject {
    
    var classes: js.UndefOr[Connector] = js.undefined
    
    var diffGranularity: js.UndefOr[specific | broad] = js.undefined
    
    var left: js.UndefOr[AceDiffLROpts] = js.undefined
    
    var maxDiffs: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[AceDiffLROpts] = js.undefined
    
    var showConnectors: js.UndefOr[Boolean] = js.undefined
    
    var showDiffs: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object AceDiffOpts {
    
    inline def apply(): AceDiffOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AceDiffOpts]
    }
    
    extension [Self <: AceDiffOpts](x: Self) {
      
      inline def setClasses(value: Connector): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDiffGranularity(value: specific | broad): Self = StObject.set(x, "diffGranularity", value.asInstanceOf[js.Any])
      
      inline def setDiffGranularityUndefined: Self = StObject.set(x, "diffGranularity", js.undefined)
      
      inline def setLeft(value: AceDiffLROpts): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMaxDiffs(value: Double): Self = StObject.set(x, "maxDiffs", value.asInstanceOf[js.Any])
      
      inline def setMaxDiffsUndefined: Self = StObject.set(x, "maxDiffs", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRight(value: AceDiffLROpts): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setShowConnectors(value: Boolean): Self = StObject.set(x, "showConnectors", value.asInstanceOf[js.Any])
      
      inline def setShowConnectorsUndefined: Self = StObject.set(x, "showConnectors", js.undefined)
      
      inline def setShowDiffs(value: Boolean): Self = StObject.set(x, "showDiffs", value.asInstanceOf[js.Any])
      
      inline def setShowDiffsUndefined: Self = StObject.set(x, "showDiffs", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
