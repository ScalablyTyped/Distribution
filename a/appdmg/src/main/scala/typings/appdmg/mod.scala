package typings.appdmg

import typings.appdmg.anon.Height
import typings.appdmg.anon.X
import typings.appdmg.appdmgStrings.UDBZ
import typings.appdmg.appdmgStrings.UDCO
import typings.appdmg.appdmgStrings.UDRO
import typings.appdmg.appdmgStrings.UDRW
import typings.appdmg.appdmgStrings.UDZO
import typings.appdmg.appdmgStrings.ULFO
import typings.appdmg.appdmgStrings.`step-begin`
import typings.appdmg.appdmgStrings.`step-end`
import typings.appdmg.appdmgStrings.error
import typings.appdmg.appdmgStrings.fail
import typings.appdmg.appdmgStrings.file
import typings.appdmg.appdmgStrings.finish
import typings.appdmg.appdmgStrings.link
import typings.appdmg.appdmgStrings.ok
import typings.appdmg.appdmgStrings.position
import typings.appdmg.appdmgStrings.progress
import typings.appdmg.appdmgStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): EventEmitter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[EventEmitter]
  @scala.inline
  def apply(options: Options): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @JSImport("appdmg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait EventEmitter
    extends StObject
       with typings.node.eventsMod.global.NodeJS.EventEmitter {
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* info */ Progress, Unit]): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var basepath: String
    
    var specification: Specification
    
    var target: String
  }
  object Options {
    
    @scala.inline
    def apply(basepath: String, specification: Specification, target: String): Options = {
      val __obj = js.Dynamic.literal(basepath = basepath.asInstanceOf[js.Any], specification = specification.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecification(value: Specification): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Progress extends StObject {
    
    var current: Double
    
    var status: ok | skip | fail
    
    var title: String
    
    var total: Double
    
    var `type`: `step-begin` | `step-end`
  }
  object Progress {
    
    @scala.inline
    def apply(
      current: Double,
      status: ok | skip | fail,
      title: String,
      total: Double,
      `type`: `step-begin` | `step-end`
    ): Progress = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ok | skip | fail): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `step-begin` | `step-end`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Specification extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var `background-color`: js.UndefOr[String] = js.undefined
    
    var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.undefined
    
    var contents: js.Array[SpecificationContents]
    
    var format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO
    
    var icon: js.UndefOr[String] = js.undefined
    
    var `icon-size`: js.UndefOr[Double] = js.undefined
    
    var title: String
    
    var window: js.UndefOr[SpecificationWindow] = js.undefined
  }
  object Specification {
    
    @scala.inline
    def apply(
      contents: js.Array[SpecificationContents],
      format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO,
      title: String
    ): Specification = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specification]
    }
    
    @scala.inline
    implicit class SpecificationMutableBuilder[Self <: Specification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def `setCode-sign`(value: SpecificationCodeSign): Self = StObject.set(x, "code-sign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCode-signUndefined`: Self = StObject.set(x, "code-sign", js.undefined)
      
      @scala.inline
      def setContents(value: js.Array[SpecificationContents]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsVarargs(value: SpecificationContents*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIcon-size`(value: Double): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: SpecificationWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait SpecificationCodeSign extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var `signing-identity`: String
  }
  object SpecificationCodeSign {
    
    @scala.inline
    def apply(`signing-identity`: String): SpecificationCodeSign = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("signing-identity")(`signing-identity`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationCodeSign]
    }
    
    @scala.inline
    implicit class SpecificationCodeSignMutableBuilder[Self <: SpecificationCodeSign] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def `setSigning-identity`(value: String): Self = StObject.set(x, "signing-identity", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpecificationContents extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var `type`: link | file | position
    
    var x: Double
    
    var y: Double
  }
  object SpecificationContents {
    
    @scala.inline
    def apply(path: String, `type`: link | file | position, x: Double, y: Double): SpecificationContents = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationContents]
    }
    
    @scala.inline
    implicit class SpecificationContentsMutableBuilder[Self <: SpecificationContents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: link | file | position): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpecificationOptions extends StObject {
    
    var app: String
    
    var background: String
    
    var icon: String
    
    var iconSize: Double
    
    var title: String
  }
  object SpecificationOptions {
    
    @scala.inline
    def apply(app: String, background: String, icon: String, iconSize: Double, title: String): SpecificationOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationOptions]
    }
    
    @scala.inline
    implicit class SpecificationOptionsMutableBuilder[Self <: SpecificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpecificationWindow extends StObject {
    
    var position: js.UndefOr[X] = js.undefined
    
    var size: js.UndefOr[Height] = js.undefined
  }
  object SpecificationWindow {
    
    @scala.inline
    def apply(): SpecificationWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificationWindow]
    }
    
    @scala.inline
    implicit class SpecificationWindowMutableBuilder[Self <: SpecificationWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
