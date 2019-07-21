package typings
package atAntDashDesignIconsDashAngularLib.componentIconDotDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective")
@js.native
class IconDirective protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnChanges {
  def this(_iconService: atAntDashDesignIconsDashAngularLib.componentIconDotServiceMod.IconService, _elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_], _renderer: atAngularCoreLib.atAngularCoreMod.Renderer2) = this()
  var _elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_] = js.native
  var _iconService: atAntDashDesignIconsDashAngularLib.componentIconDotServiceMod.IconService = js.native
  var _renderer: atAngularCoreLib.atAngularCoreMod.Renderer2 = js.native
  var theme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType = js.native
  var twoToneColor: java.lang.String = js.native
  var `type`: java.lang.String | atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition = js.native
  /**
    * Render a new icon in the current element. Remove the icon when `type` is falsy.
    */
  /* protected */ def _changeIcon(): js.Promise[stdLib.SVGElement | scala.Null] = js.native
  /* protected */ def _clearSVGElement(): scala.Unit = js.native
  /* protected */ def _parseIconType(
    `type`: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition,
    theme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType
  ): atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition | java.lang.String = js.native
  /**
    * Parse a icon to the standard form, an `IconDefinition` or a string like 'account-book-fill` (with a theme suffixed).
    * If namespace is specified, ignore theme because it meaningless for users' icons.
    * @param type
    * @param theme
    */
  /* protected */ def _parseIconType(`type`: java.lang.String, theme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType): atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition | java.lang.String = js.native
  /* protected */ def _setSVGElement(svg: stdLib.SVGElement): scala.Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.atAngularCoreMod.SimpleChanges): scala.Unit = js.native
}

