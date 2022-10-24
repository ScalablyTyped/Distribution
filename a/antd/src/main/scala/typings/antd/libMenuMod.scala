package typings.antd

import typings.antd.antdStrings.`additions removals`
import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.`removals additions`
import typings.antd.antdStrings.`removals text`
import typings.antd.antdStrings.`text additions`
import typings.antd.antdStrings.`text removals`
import typings.antd.antdStrings.additions
import typings.antd.antdStrings.all
import typings.antd.antdStrings.ascending
import typings.antd.antdStrings.assertive
import typings.antd.antdStrings.both
import typings.antd.antdStrings.copy
import typings.antd.antdStrings.date
import typings.antd.antdStrings.decimal
import typings.antd.antdStrings.descending
import typings.antd.antdStrings.dialog
import typings.antd.antdStrings.email
import typings.antd.antdStrings.execute
import typings.antd.antdStrings.grammar
import typings.antd.antdStrings.grid
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.inherit
import typings.antd.antdStrings.link
import typings.antd.antdStrings.list
import typings.antd.antdStrings.listbox
import typings.antd.antdStrings.location
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.menu
import typings.antd.antdStrings.mixed
import typings.antd.antdStrings.move
import typings.antd.antdStrings.no
import typings.antd.antdStrings.none
import typings.antd.antdStrings.numeric
import typings.antd.antdStrings.off
import typings.antd.antdStrings.on
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.rtl
import typings.antd.antdStrings.search
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.tel
import typings.antd.antdStrings.text_
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.url
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.yes
import typings.antd.libMenuHooksUseItemsMod.ItemType
import typings.antd.libMenuMenuContextMod.MenuContextProps
import typings.antd.libMenuMenuContextMod.MenuTheme
import typings.antd.libMenuMenuDividerMod.MenuDividerProps
import typings.antd.libMenuSubMenuMod.SubMenuProps
import typings.rcMenu.anon.Active
import typings.rcMenu.anon.PartialkeyinMenuModeother
import typings.rcMenu.anon.Selected
import typings.rcMenu.esInterfaceMod.BuiltinPlacements
import typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcMenu.esInterfaceMod.MenuInfo
import typings.rcMenu.esInterfaceMod.MenuRef
import typings.rcMenu.esInterfaceMod.RenderIconInfo
import typings.rcMenu.esInterfaceMod.RenderIconType
import typings.rcMenu.esInterfaceMod.SelectEventHandler
import typings.rcMenu.esInterfaceMod.SelectInfo
import typings.rcMenu.esInterfaceMod.TriggerSubMenuAction
import typings.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.Context
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenuMod {
  
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  open class default () extends Menu
  object default {
    
    @JSImport("antd/lib/menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/menu", "default.Divider")
    @js.native
    def Divider: FC[MenuDividerProps] = js.native
    inline def Divider_=(x: FC[MenuDividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/menu", "default.Item")
    @js.native
    open class Item ()
      extends typings.antd.libMenuMenuItemMod.default
    /* static member */
    /* was `typeof Item` */
    object Item {
      
      @JSImport("antd/lib/menu", "default.Item")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/menu", "default.Item.contextType")
      @js.native
      def contextType: Context[MenuContextProps] = js.native
      inline def contextType_=(x: Context[MenuContextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    /* was `typeof ItemGroup` */
    @JSImport("antd/lib/menu", "default.ItemGroup")
    @js.native
    def ItemGroup: js.Function1[/* param0 */ MenuItemGroupProps, ReactElement] = js.native
    inline def ItemGroup_=(x: js.Function1[/* param0 */ MenuItemGroupProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof SubMenu` */
    @JSImport("antd/lib/menu", "default.SubMenu")
    @js.native
    def SubMenu: js.Function1[/* props */ SubMenuProps, Element] = js.native
    inline def SubMenu_=(x: js.Function1[/* props */ SubMenuProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubMenu")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, js.Object, Any] {
    
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    var menu: MenuRef | Null = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.vertical
    - typings.antd.antdStrings.`vertical-left`
    - typings.antd.antdStrings.`vertical-right`
    - typings.antd.antdStrings.horizontal
    - typings.antd.antdStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    inline def horizontal: typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typings.antd.antdStrings.horizontal]
    
    inline def `inline`: typings.antd.antdStrings.`inline` = "inline".asInstanceOf[typings.antd.antdStrings.`inline`]
    
    inline def vertical: typings.antd.antdStrings.vertical = "vertical".asInstanceOf[typings.antd.antdStrings.vertical]
    
    inline def `vertical-left`: typings.antd.antdStrings.`vertical-left` = "vertical-left".asInstanceOf[typings.antd.antdStrings.`vertical-left`]
    
    inline def `vertical-right`: typings.antd.antdStrings.`vertical-right` = "vertical-right".asInstanceOf[typings.antd.antdStrings.`vertical-right`]
  }
  
  /* Inlined parent std.Omit<rc-menu.rc-menu.MenuProps, 'items'> */
  trait MenuProps extends StObject {
    
    var _internalRenderMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* menuItemProps */ Any, 
          /* stateProps */ Selected, 
          ReactElement
        ]
      ] = js.undefined
    
    var _internalRenderSubMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* subMenuItemProps */ Any, 
          /* stateProps */ Active, 
          ReactElement
        ]
      ] = js.undefined
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var activeKey: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.undefined
    
    var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledOverflow: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlineCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var inlineIndent: js.UndefOr[Double] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text_ | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[ItemType]] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[typings.rcMenu.esInterfaceMod.MenuMode] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLUListElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLUListElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLUListElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLUListElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLUListElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLUListElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLUListElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLUListElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLUListElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLUListElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLUListElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLUListElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLUListElement]] = js.undefined
    
    var openKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
    
    var overflowedIndicatorPopupClassName: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
    
    var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[MenuTheme] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultActiveFirst(value: Boolean): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      inline def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      inline def setDefaultOpenKeys(value: js.Array[String]): Self = StObject.set(x, "defaultOpenKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenKeysUndefined: Self = StObject.set(x, "defaultOpenKeys", js.undefined)
      
      inline def setDefaultOpenKeysVarargs(value: String*): Self = StObject.set(x, "defaultOpenKeys", js.Array(value*))
      
      inline def setDefaultSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: String*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value*))
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledOverflow(value: Boolean): Self = StObject.set(x, "disabledOverflow", value.asInstanceOf[js.Any])
      
      inline def setDisabledOverflowUndefined: Self = StObject.set(x, "disabledOverflow", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlineCollapsed(value: Boolean): Self = StObject.set(x, "inlineCollapsed", value.asInstanceOf[js.Any])
      
      inline def setInlineCollapsedUndefined: Self = StObject.set(x, "inlineCollapsed", js.undefined)
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text_ | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setItems(value: js.Array[ItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ItemType*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMode(value: typings.rcMenu.esInterfaceMod.MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLUListElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDeselect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLUListElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLUListElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOpenChange(value: /* openKeys */ js.Array[String] => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLUListElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLUListElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      inline def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
      
      inline def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value*))
      
      inline def setOverflowedIndicator(value: ReactNode): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
      
      inline def setOverflowedIndicatorPopupClassName(value: String): Self = StObject.set(x, "overflowedIndicatorPopupClassName", value.asInstanceOf[js.Any])
      
      inline def setOverflowedIndicatorPopupClassNameUndefined: Self = StObject.set(x, "overflowedIndicatorPopupClassName", js.undefined)
      
      inline def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
      
      inline def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def set_internalRenderMenuItem(
        value: (/* originNode */ ReactElement, /* menuItemProps */ Any, /* stateProps */ Selected) => ReactElement
      ): Self = StObject.set(x, "_internalRenderMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderMenuItemUndefined: Self = StObject.set(x, "_internalRenderMenuItem", js.undefined)
      
      inline def set_internalRenderSubMenuItem(
        value: (/* originNode */ ReactElement, /* subMenuItemProps */ Any, /* stateProps */ Active) => ReactElement
      ): Self = StObject.set(x, "_internalRenderSubMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderSubMenuItemUndefined: Self = StObject.set(x, "_internalRenderSubMenuItem", js.undefined)
    }
  }
}
