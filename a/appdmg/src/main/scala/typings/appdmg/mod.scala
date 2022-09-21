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
  
  inline def apply(): EventEmitter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[EventEmitter]
  inline def apply(options: Options): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @JSImport("appdmg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait EventEmitter
    extends StObject
       with typings.node.eventsMod.global.NodeJS.EventEmitter {
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* info */ Progress, Unit]): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var basepath: String
    
    var source: js.UndefOr[String] = js.undefined
    
    var specification: Specification
    
    var target: String
  }
  object Options {
    
    inline def apply(basepath: String, specification: Specification, target: String): Options = {
      val __obj = js.Dynamic.literal(basepath = basepath.asInstanceOf[js.Any], specification = specification.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSpecification(value: Specification): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
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
    
    inline def apply(
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
    
    extension [Self <: Progress](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ok | skip | fail): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setType(value: `step-begin` | `step-end`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      contents: js.Array[SpecificationContents],
      format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO,
      title: String
    ): Specification = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Specification]
    }
    
    extension [Self <: Specification](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
      
      inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def `setCode-sign`(value: SpecificationCodeSign): Self = StObject.set(x, "code-sign", value.asInstanceOf[js.Any])
      
      inline def `setCode-signUndefined`: Self = StObject.set(x, "code-sign", js.undefined)
      
      inline def setContents(value: js.Array[SpecificationContents]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: SpecificationContents*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def `setIcon-size`(value: Double): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
      
      inline def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: SpecificationWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait SpecificationCodeSign extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var `signing-identity`: String
  }
  object SpecificationCodeSign {
    
    inline def apply(`signing-identity`: String): SpecificationCodeSign = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("signing-identity")(`signing-identity`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationCodeSign]
    }
    
    extension [Self <: SpecificationCodeSign](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def `setSigning-identity`(value: String): Self = StObject.set(x, "signing-identity", value.asInstanceOf[js.Any])
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
    
    inline def apply(path: String, `type`: link | file | position, x: Double, y: Double): SpecificationContents = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationContents]
    }
    
    extension [Self <: SpecificationContents](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: link | file | position): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
    
    inline def apply(app: String, background: String, icon: String, iconSize: Double, title: String): SpecificationOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificationOptions]
    }
    
    extension [Self <: SpecificationOptions](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpecificationWindow extends StObject {
    
    var position: js.UndefOr[X] = js.undefined
    
    var size: js.UndefOr[Height] = js.undefined
  }
  object SpecificationWindow {
    
    inline def apply(): SpecificationWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificationWindow]
    }
    
    extension [Self <: SpecificationWindow](x: Self) {
      
      inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
