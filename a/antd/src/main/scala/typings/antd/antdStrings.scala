package typings.antd

import typings.antd.baseMod.BaseType
import typings.antd.buttonButtonMod.ButtonHTMLType
import typings.antd.buttonButtonMod.ButtonShape
import typings.antd.buttonButtonMod.ButtonType
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.antd.cardMod.CardSize
import typings.antd.carouselMod.CarouselEffect
import typings.antd.carouselMod.DotPosition
import typings.antd.cascaderMod.CascaderExpandTrigger
import typings.antd.collapseCollapseMod._ExpandIconPosition
import typings.antd.configProviderContextMod._DirectionType
import typings.antd.configProviderSizeContextMod._SizeType
import typings.antd.directoryTreeMod.ExpandAction
import typings.antd.drawerMod.placementType
import typings.antd.dropdownButtonMod.DropdownButtonType
import typings.antd.dropdownDropdownMod.Placement
import typings.antd.formFormMod.FormLayout
import typings.antd.formItemMod.ValidateStatus
import typings.antd.generateCalendarMod.CalendarMode
import typings.antd.gridColMod._FlexType
import typings.antd.inputNumberMod.OmitAttrs
import typings.antd.interfaceMod.FormLabelAlign
import typings.antd.listMod.ColumnType
import typings.antd.listMod.ListItemLayout
import typings.antd.listMod.ListSize
import typings.antd.localeReceiverMod.LocaleComponent
import typings.antd.mentionsMod.MentionPlacement
import typings.antd.menuContextMod.MenuTheme
import typings.antd.menuMod.MenuMode
import typings.antd.messageMod.NoticeType
import typings.antd.notificationMod.IconType
import typings.antd.notificationMod.NotificationPlacement
import typings.antd.paginationPaginationMod.PaginationPosition
import typings.antd.progressProgressMod.ProgressSize
import typings.antd.progressProgressMod.ProgressType
import typings.antd.radioInterfaceMod.RadioGroupButtonStyle
import typings.antd.radioInterfaceMod.RadioGroupOptionType
import typings.antd.responsiveObserveMod.Breakpoint
import typings.antd.resultMod.ExceptionStatusType
import typings.antd.resultMod.ResultStatusType
import typings.antd.ribbonMod.RibbonPlacement
import typings.antd.siderMod.CollapseType
import typings.antd.siderMod.SiderTheme
import typings.antd.sizeContextMod._AvatarSize
import typings.antd.spinMod.SpinSize
import typings.antd.statisticUtilsMod._Formatter
import typings.antd.switchMod.SwitchSize
import typings.antd.tableInterfaceMod.RowSelectionType
import typings.antd.tableInterfaceMod.TableAction
import typings.antd.tableInterfaceMod.TablePaginationPosition
import typings.antd.tableInterfaceMod._ExpandType
import typings.antd.tableInterfaceMod._SortOrder
import typings.antd.tabsMod.TabsPosition
import typings.antd.tabsMod.TabsType
import typings.antd.tooltipMod.TooltipPlacement
import typings.antd.transferMod.TransferDirection
import typings.antd.uploadInterfaceMod.UploadFileStatus
import typings.antd.uploadInterfaceMod.UploadListType
import typings.antd.uploadInterfaceMod.UploadType
import typings.antd.useSelectionMod.INTERNAL_SELECTION_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antdStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ButtonType
       with CardSize
       with ListSize
       with ProgressSize
       with RadioGroupOptionType
       with SpinSize
       with SwitchSize
       with _AvatarSize
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `403`
    extends StObject
       with ExceptionStatusType
  @scala.inline
  def `403`: `403` = "403".asInstanceOf[`403`]
  
  @js.native
  sealed trait `404`
    extends StObject
       with ExceptionStatusType
  @scala.inline
  def `404`: `404` = "404".asInstanceOf[`404`]
  
  @js.native
  sealed trait `4Dot8Dot5` extends StObject
  @scala.inline
  def `4Dot8Dot5`: `4Dot8Dot5` = "4.8.5".asInstanceOf[`4Dot8Dot5`]
  
  @js.native
  sealed trait `500`
    extends StObject
       with ExceptionStatusType
  @scala.inline
  def `500`: `500` = "500".asInstanceOf[`500`]
  
  @js.native
  sealed trait Calendar
    extends StObject
       with LocaleComponent
  @scala.inline
  def Calendar: Calendar = "Calendar".asInstanceOf[Calendar]
  
  @js.native
  sealed trait DatePicker
    extends StObject
       with LocaleComponent
  @scala.inline
  def DatePicker: DatePicker = "DatePicker".asInstanceOf[DatePicker]
  
  @js.native
  sealed trait Empty
    extends StObject
       with LocaleComponent
  @scala.inline
  def Empty: Empty = "Empty".asInstanceOf[Empty]
  
  @js.native
  sealed trait Form
    extends StObject
       with LocaleComponent
  @scala.inline
  def Form: Form = "Form".asInstanceOf[Form]
  
  @js.native
  sealed trait Icon
    extends StObject
       with LocaleComponent
  @scala.inline
  def Icon: Icon = "Icon".asInstanceOf[Icon]
  
  @js.native
  sealed trait Modal
    extends StObject
       with LocaleComponent
  @scala.inline
  def Modal: Modal = "Modal".asInstanceOf[Modal]
  
  @js.native
  sealed trait PATCH extends StObject
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST extends StObject
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait PageHeader
    extends StObject
       with LocaleComponent
  @scala.inline
  def PageHeader: PageHeader = "PageHeader".asInstanceOf[PageHeader]
  
  @js.native
  sealed trait Pagination
    extends StObject
       with LocaleComponent
  @scala.inline
  def Pagination: Pagination = "Pagination".asInstanceOf[Pagination]
  
  @js.native
  sealed trait Popconfirm
    extends StObject
       with LocaleComponent
  @scala.inline
  def Popconfirm: Popconfirm = "Popconfirm".asInstanceOf[Popconfirm]
  
  @js.native
  sealed trait SECRET_COMBOBOX_MODE_DO_NOT_USE extends StObject
  @scala.inline
  def SECRET_COMBOBOX_MODE_DO_NOT_USE: SECRET_COMBOBOX_MODE_DO_NOT_USE = "SECRET_COMBOBOX_MODE_DO_NOT_USE".asInstanceOf[SECRET_COMBOBOX_MODE_DO_NOT_USE]
  
  @js.native
  sealed trait SELECT_ALL
    extends StObject
       with INTERNAL_SELECTION_ITEM
  @scala.inline
  def SELECT_ALL: SELECT_ALL = "SELECT_ALL".asInstanceOf[SELECT_ALL]
  
  @js.native
  sealed trait SELECT_INVERT
    extends StObject
       with INTERNAL_SELECTION_ITEM
  @scala.inline
  def SELECT_INVERT: SELECT_INVERT = "SELECT_INVERT".asInstanceOf[SELECT_INVERT]
  
  @js.native
  sealed trait Select
    extends StObject
       with LocaleComponent
  @scala.inline
  def Select: Select = "Select".asInstanceOf[Select]
  
  @js.native
  sealed trait Table
    extends StObject
       with LocaleComponent
  @scala.inline
  def Table: Table = "Table".asInstanceOf[Table]
  
  @js.native
  sealed trait Text
    extends StObject
       with LocaleComponent
  @scala.inline
  def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait TimePicker
    extends StObject
       with LocaleComponent
  @scala.inline
  def TimePicker: TimePicker = "TimePicker".asInstanceOf[TimePicker]
  
  @js.native
  sealed trait Transfer
    extends StObject
       with LocaleComponent
  @scala.inline
  def Transfer: Transfer = "Transfer".asInstanceOf[Transfer]
  
  @js.native
  sealed trait Upload
    extends StObject
       with LocaleComponent
  @scala.inline
  def Upload: Upload = "Upload".asInstanceOf[Upload]
  
  @js.native
  sealed trait _empty
    extends StObject
       with ValidateStatus
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait active extends StObject
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add extends StObject
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait additions extends StObject
  @scala.inline
  def additions: additions = "additions".asInstanceOf[additions]
  
  @js.native
  sealed trait `additions removals` extends StObject
  @scala.inline
  def `additions removals`: `additions removals` = ("additions removals").asInstanceOf[`additions removals`]
  
  @js.native
  sealed trait `additions text` extends StObject
  @scala.inline
  def `additions text`: `additions text` = ("additions text").asInstanceOf[`additions text`]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allowClear extends StObject
  @scala.inline
  def allowClear: allowClear = "allowClear".asInstanceOf[allowClear]
  
  @js.native
  sealed trait alternate extends StObject
  @scala.inline
  def alternate: alternate = "alternate".asInstanceOf[alternate]
  
  @js.native
  sealed trait `aria-activedescendant` extends StObject
  @scala.inline
  def `aria-activedescendant`: `aria-activedescendant` = "aria-activedescendant".asInstanceOf[`aria-activedescendant`]
  
  @js.native
  sealed trait `aria-atomic` extends StObject
  @scala.inline
  def `aria-atomic`: `aria-atomic` = "aria-atomic".asInstanceOf[`aria-atomic`]
  
  @js.native
  sealed trait `aria-autocomplete` extends StObject
  @scala.inline
  def `aria-autocomplete`: `aria-autocomplete` = "aria-autocomplete".asInstanceOf[`aria-autocomplete`]
  
  @js.native
  sealed trait `aria-busy` extends StObject
  @scala.inline
  def `aria-busy`: `aria-busy` = "aria-busy".asInstanceOf[`aria-busy`]
  
  @js.native
  sealed trait `aria-checked` extends StObject
  @scala.inline
  def `aria-checked`: `aria-checked` = "aria-checked".asInstanceOf[`aria-checked`]
  
  @js.native
  sealed trait `aria-colcount` extends StObject
  @scala.inline
  def `aria-colcount`: `aria-colcount` = "aria-colcount".asInstanceOf[`aria-colcount`]
  
  @js.native
  sealed trait `aria-colindex` extends StObject
  @scala.inline
  def `aria-colindex`: `aria-colindex` = "aria-colindex".asInstanceOf[`aria-colindex`]
  
  @js.native
  sealed trait `aria-colspan` extends StObject
  @scala.inline
  def `aria-colspan`: `aria-colspan` = "aria-colspan".asInstanceOf[`aria-colspan`]
  
  @js.native
  sealed trait `aria-controls` extends StObject
  @scala.inline
  def `aria-controls`: `aria-controls` = "aria-controls".asInstanceOf[`aria-controls`]
  
  @js.native
  sealed trait `aria-current` extends StObject
  @scala.inline
  def `aria-current`: `aria-current` = "aria-current".asInstanceOf[`aria-current`]
  
  @js.native
  sealed trait `aria-describedby` extends StObject
  @scala.inline
  def `aria-describedby`: `aria-describedby` = "aria-describedby".asInstanceOf[`aria-describedby`]
  
  @js.native
  sealed trait `aria-details` extends StObject
  @scala.inline
  def `aria-details`: `aria-details` = "aria-details".asInstanceOf[`aria-details`]
  
  @js.native
  sealed trait `aria-disabled` extends StObject
  @scala.inline
  def `aria-disabled`: `aria-disabled` = "aria-disabled".asInstanceOf[`aria-disabled`]
  
  @js.native
  sealed trait `aria-dropeffect` extends StObject
  @scala.inline
  def `aria-dropeffect`: `aria-dropeffect` = "aria-dropeffect".asInstanceOf[`aria-dropeffect`]
  
  @js.native
  sealed trait `aria-errormessage` extends StObject
  @scala.inline
  def `aria-errormessage`: `aria-errormessage` = "aria-errormessage".asInstanceOf[`aria-errormessage`]
  
  @js.native
  sealed trait `aria-expanded` extends StObject
  @scala.inline
  def `aria-expanded`: `aria-expanded` = "aria-expanded".asInstanceOf[`aria-expanded`]
  
  @js.native
  sealed trait `aria-flowto` extends StObject
  @scala.inline
  def `aria-flowto`: `aria-flowto` = "aria-flowto".asInstanceOf[`aria-flowto`]
  
  @js.native
  sealed trait `aria-grabbed` extends StObject
  @scala.inline
  def `aria-grabbed`: `aria-grabbed` = "aria-grabbed".asInstanceOf[`aria-grabbed`]
  
  @js.native
  sealed trait `aria-haspopup` extends StObject
  @scala.inline
  def `aria-haspopup`: `aria-haspopup` = "aria-haspopup".asInstanceOf[`aria-haspopup`]
  
  @js.native
  sealed trait `aria-hidden` extends StObject
  @scala.inline
  def `aria-hidden`: `aria-hidden` = "aria-hidden".asInstanceOf[`aria-hidden`]
  
  @js.native
  sealed trait `aria-invalid` extends StObject
  @scala.inline
  def `aria-invalid`: `aria-invalid` = "aria-invalid".asInstanceOf[`aria-invalid`]
  
  @js.native
  sealed trait `aria-keyshortcuts` extends StObject
  @scala.inline
  def `aria-keyshortcuts`: `aria-keyshortcuts` = "aria-keyshortcuts".asInstanceOf[`aria-keyshortcuts`]
  
  @js.native
  sealed trait `aria-label` extends StObject
  @scala.inline
  def `aria-label`: `aria-label` = "aria-label".asInstanceOf[`aria-label`]
  
  @js.native
  sealed trait `aria-labelledby` extends StObject
  @scala.inline
  def `aria-labelledby`: `aria-labelledby` = "aria-labelledby".asInstanceOf[`aria-labelledby`]
  
  @js.native
  sealed trait `aria-level` extends StObject
  @scala.inline
  def `aria-level`: `aria-level` = "aria-level".asInstanceOf[`aria-level`]
  
  @js.native
  sealed trait `aria-live` extends StObject
  @scala.inline
  def `aria-live`: `aria-live` = "aria-live".asInstanceOf[`aria-live`]
  
  @js.native
  sealed trait `aria-modal` extends StObject
  @scala.inline
  def `aria-modal`: `aria-modal` = "aria-modal".asInstanceOf[`aria-modal`]
  
  @js.native
  sealed trait `aria-multiline` extends StObject
  @scala.inline
  def `aria-multiline`: `aria-multiline` = "aria-multiline".asInstanceOf[`aria-multiline`]
  
  @js.native
  sealed trait `aria-multiselectable` extends StObject
  @scala.inline
  def `aria-multiselectable`: `aria-multiselectable` = "aria-multiselectable".asInstanceOf[`aria-multiselectable`]
  
  @js.native
  sealed trait `aria-orientation` extends StObject
  @scala.inline
  def `aria-orientation`: `aria-orientation` = "aria-orientation".asInstanceOf[`aria-orientation`]
  
  @js.native
  sealed trait `aria-owns` extends StObject
  @scala.inline
  def `aria-owns`: `aria-owns` = "aria-owns".asInstanceOf[`aria-owns`]
  
  @js.native
  sealed trait `aria-placeholder` extends StObject
  @scala.inline
  def `aria-placeholder`: `aria-placeholder` = "aria-placeholder".asInstanceOf[`aria-placeholder`]
  
  @js.native
  sealed trait `aria-posinset` extends StObject
  @scala.inline
  def `aria-posinset`: `aria-posinset` = "aria-posinset".asInstanceOf[`aria-posinset`]
  
  @js.native
  sealed trait `aria-pressed` extends StObject
  @scala.inline
  def `aria-pressed`: `aria-pressed` = "aria-pressed".asInstanceOf[`aria-pressed`]
  
  @js.native
  sealed trait `aria-readonly` extends StObject
  @scala.inline
  def `aria-readonly`: `aria-readonly` = "aria-readonly".asInstanceOf[`aria-readonly`]
  
  @js.native
  sealed trait `aria-relevant` extends StObject
  @scala.inline
  def `aria-relevant`: `aria-relevant` = "aria-relevant".asInstanceOf[`aria-relevant`]
  
  @js.native
  sealed trait `aria-required` extends StObject
  @scala.inline
  def `aria-required`: `aria-required` = "aria-required".asInstanceOf[`aria-required`]
  
  @js.native
  sealed trait `aria-roledescription` extends StObject
  @scala.inline
  def `aria-roledescription`: `aria-roledescription` = "aria-roledescription".asInstanceOf[`aria-roledescription`]
  
  @js.native
  sealed trait `aria-rowcount` extends StObject
  @scala.inline
  def `aria-rowcount`: `aria-rowcount` = "aria-rowcount".asInstanceOf[`aria-rowcount`]
  
  @js.native
  sealed trait `aria-rowindex` extends StObject
  @scala.inline
  def `aria-rowindex`: `aria-rowindex` = "aria-rowindex".asInstanceOf[`aria-rowindex`]
  
  @js.native
  sealed trait `aria-rowspan` extends StObject
  @scala.inline
  def `aria-rowspan`: `aria-rowspan` = "aria-rowspan".asInstanceOf[`aria-rowspan`]
  
  @js.native
  sealed trait `aria-selected` extends StObject
  @scala.inline
  def `aria-selected`: `aria-selected` = "aria-selected".asInstanceOf[`aria-selected`]
  
  @js.native
  sealed trait `aria-setsize` extends StObject
  @scala.inline
  def `aria-setsize`: `aria-setsize` = "aria-setsize".asInstanceOf[`aria-setsize`]
  
  @js.native
  sealed trait `aria-sort` extends StObject
  @scala.inline
  def `aria-sort`: `aria-sort` = "aria-sort".asInstanceOf[`aria-sort`]
  
  @js.native
  sealed trait `aria-valuemax` extends StObject
  @scala.inline
  def `aria-valuemax`: `aria-valuemax` = "aria-valuemax".asInstanceOf[`aria-valuemax`]
  
  @js.native
  sealed trait `aria-valuemin` extends StObject
  @scala.inline
  def `aria-valuemin`: `aria-valuemin` = "aria-valuemin".asInstanceOf[`aria-valuemin`]
  
  @js.native
  sealed trait `aria-valuenow` extends StObject
  @scala.inline
  def `aria-valuenow`: `aria-valuenow` = "aria-valuenow".asInstanceOf[`aria-valuenow`]
  
  @js.native
  sealed trait `aria-valuetext` extends StObject
  @scala.inline
  def `aria-valuetext`: `aria-valuetext` = "aria-valuetext".asInstanceOf[`aria-valuetext`]
  
  @js.native
  sealed trait ascend
    extends StObject
       with _SortOrder
  @scala.inline
  def ascend: ascend = "ascend".asInstanceOf[ascend]
  
  @js.native
  sealed trait ascending extends StObject
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait assertive extends StObject
  @scala.inline
  def assertive: assertive = "assertive".asInstanceOf[assertive]
  
  @js.native
  sealed trait auto
    extends StObject
       with _FlexType
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait autoComplete extends StObject
  @scala.inline
  def autoComplete: autoComplete = "autoComplete".asInstanceOf[autoComplete]
  
  @js.native
  sealed trait autoFocus extends StObject
  @scala.inline
  def autoFocus: autoFocus = "autoFocus".asInstanceOf[autoFocus]
  
  @js.native
  sealed trait baseline extends StObject
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait blue extends StObject
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait bordered extends StObject
  @scala.inline
  def bordered: bordered = "bordered".asInstanceOf[bordered]
  
  @js.native
  sealed trait both
    extends StObject
       with PaginationPosition
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom
    extends StObject
       with DotPosition
       with MentionPlacement
       with PaginationPosition
       with TabsPosition
       with TooltipPlacement
       with placementType
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait bottomCenter
    extends StObject
       with Placement
       with TablePaginationPosition
  @scala.inline
  def bottomCenter: bottomCenter = "bottomCenter".asInstanceOf[bottomCenter]
  
  @js.native
  sealed trait bottomLeft
    extends StObject
       with NotificationPlacement
       with Placement
       with TablePaginationPosition
       with TooltipPlacement
  @scala.inline
  def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  
  @js.native
  sealed trait bottomRight
    extends StObject
       with NotificationPlacement
       with Placement
       with TablePaginationPosition
       with TooltipPlacement
  @scala.inline
  def bottomRight: bottomRight = "bottomRight".asInstanceOf[bottomRight]
  
  @js.native
  sealed trait butt extends StObject
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait button
    extends StObject
       with ButtonHTMLType
       with RadioGroupOptionType
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait cancel extends StObject
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait card
    extends StObject
       with TabsType
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait center extends StObject
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait check extends StObject
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with RowSelectionType
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait checkedKeys extends StObject
  @scala.inline
  def checkedKeys: checkedKeys = "checkedKeys".asInstanceOf[checkedKeys]
  
  @js.native
  sealed trait circle
    extends StObject
       with ButtonShape
       with ProgressType
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait className extends StObject
  @scala.inline
  def className: className = "className".asInstanceOf[className]
  
  @js.native
  sealed trait clearIcon extends StObject
  @scala.inline
  def clearIcon: clearIcon = "clearIcon".asInstanceOf[clearIcon]
  
  @js.native
  sealed trait click
    extends StObject
       with CascaderExpandTrigger
       with ExpandAction
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait clickTrigger
    extends StObject
       with CollapseType
  @scala.inline
  def clickTrigger: clickTrigger = "clickTrigger".asInstanceOf[clickTrigger]
  
  @js.native
  sealed trait color extends StObject
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait column
    extends StObject
       with ColumnType
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait components extends StObject
  @scala.inline
  def components: components = "components".asInstanceOf[components]
  
  @js.native
  sealed trait contextMenu extends StObject
  @scala.inline
  def contextMenu: contextMenu = "contextMenu".asInstanceOf[contextMenu]
  
  @js.native
  sealed trait copy extends StObject
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait countdown
    extends StObject
       with _Formatter
  @scala.inline
  def countdown: countdown = "countdown".asInstanceOf[countdown]
  
  @js.native
  sealed trait cyan extends StObject
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait danger
    extends StObject
       with BaseType
       with LegacyButtonType
  @scala.inline
  def danger: danger = "danger".asInstanceOf[danger]
  
  @js.native
  sealed trait dark
    extends StObject
       with MenuTheme
       with SiderTheme
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait dashboard
    extends StObject
       with ProgressType
  @scala.inline
  def dashboard: dashboard = "dashboard".asInstanceOf[dashboard]
  
  @js.native
  sealed trait dashed
    extends StObject
       with ButtonType
       with DropdownButtonType
  @scala.inline
  def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait date extends StObject
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dateRender extends StObject
  @scala.inline
  def dateRender: dateRender = "dateRender".asInstanceOf[dateRender]
  
  @js.native
  sealed trait `datetime-local` extends StObject
  @scala.inline
  def `datetime-local`: `datetime-local` = "datetime-local".asInstanceOf[`datetime-local`]
  
  @js.native
  sealed trait decimal extends StObject
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait defaultOpen extends StObject
  @scala.inline
  def defaultOpen: defaultOpen = "defaultOpen".asInstanceOf[defaultOpen]
  
  @js.native
  sealed trait defaultOpenValue extends StObject
  @scala.inline
  def defaultOpenValue: defaultOpenValue = "defaultOpenValue".asInstanceOf[defaultOpenValue]
  
  @js.native
  sealed trait defaultPickerValue extends StObject
  @scala.inline
  def defaultPickerValue: defaultPickerValue = "defaultPickerValue".asInstanceOf[defaultPickerValue]
  
  @js.native
  sealed trait defaultValue
    extends StObject
       with OmitAttrs
  @scala.inline
  def defaultValue: defaultValue = "defaultValue".asInstanceOf[defaultValue]
  
  @js.native
  sealed trait descend
    extends StObject
       with _SortOrder
  @scala.inline
  def descend: descend = "descend".asInstanceOf[descend]
  
  @js.native
  sealed trait descending extends StObject
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait dialog extends StObject
  @scala.inline
  def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait direction extends StObject
  @scala.inline
  def direction: direction = "direction".asInstanceOf[direction]
  
  @js.native
  sealed trait disabled extends StObject
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait disabledDate extends StObject
  @scala.inline
  def disabledDate: disabledDate = "disabledDate".asInstanceOf[disabledDate]
  
  @js.native
  sealed trait disabledHours extends StObject
  @scala.inline
  def disabledHours: disabledHours = "disabledHours".asInstanceOf[disabledHours]
  
  @js.native
  sealed trait disabledMinutes extends StObject
  @scala.inline
  def disabledMinutes: disabledMinutes = "disabledMinutes".asInstanceOf[disabledMinutes]
  
  @js.native
  sealed trait disabledSeconds extends StObject
  @scala.inline
  def disabledSeconds: disabledSeconds = "disabledSeconds".asInstanceOf[disabledSeconds]
  
  @js.native
  sealed trait disabledTime extends StObject
  @scala.inline
  def disabledTime: disabledTime = "disabledTime".asInstanceOf[disabledTime]
  
  @js.native
  sealed trait done
    extends StObject
       with UploadFileStatus
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with ExpandAction
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait down extends StObject
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait drag
    extends StObject
       with UploadType
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dropdownAlign extends StObject
  @scala.inline
  def dropdownAlign: dropdownAlign = "dropdownAlign".asInstanceOf[dropdownAlign]
  
  @js.native
  sealed trait dropdownClassName extends StObject
  @scala.inline
  def dropdownClassName: dropdownClassName = "dropdownClassName".asInstanceOf[dropdownClassName]
  
  @js.native
  sealed trait `editable-card`
    extends StObject
       with TabsType
  @scala.inline
  def `editable-card`: `editable-card` = "editable-card".asInstanceOf[`editable-card`]
  
  @js.native
  sealed trait email extends StObject
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait end
    extends StObject
       with RibbonPlacement
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter extends StObject
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait error
    extends StObject
       with IconType
       with NoticeType
       with ResultStatusType
       with UploadFileStatus
       with ValidateStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait exception extends StObject
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait execute extends StObject
  @scala.inline
  def execute: execute = "execute".asInstanceOf[execute]
  
  @js.native
  sealed trait fade
    extends StObject
       with CarouselEffect
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait file extends StObject
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filter
    extends StObject
       with TableAction
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait finish extends StObject
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait focus extends StObject
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait footer extends StObject
  @scala.inline
  def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait format extends StObject
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait geekblue extends StObject
  @scala.inline
  def geekblue: geekblue = "geekblue".asInstanceOf[geekblue]
  
  @js.native
  sealed trait generateConfig extends StObject
  @scala.inline
  def generateConfig: generateConfig = "generateConfig".asInstanceOf[generateConfig]
  
  @js.native
  sealed trait getPopupContainer extends StObject
  @scala.inline
  def getPopupContainer: getPopupContainer = "getPopupContainer".asInstanceOf[getPopupContainer]
  
  @js.native
  sealed trait ghost
    extends StObject
       with ButtonType
       with DropdownButtonType
  @scala.inline
  def ghost: ghost = "ghost".asInstanceOf[ghost]
  
  @js.native
  sealed trait global
    extends StObject
       with LocaleComponent
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait go extends StObject
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait gold extends StObject
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait grammar extends StObject
  @scala.inline
  def grammar: grammar = "grammar".asInstanceOf[grammar]
  
  @js.native
  sealed trait green extends StObject
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait grid extends StObject
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait gutter
    extends StObject
       with ColumnType
  @scala.inline
  def gutter: gutter = "gutter".asInstanceOf[gutter]
  
  @js.native
  sealed trait handleClear extends StObject
  @scala.inline
  def handleClear: handleClear = "handleClear".asInstanceOf[handleClear]
  
  @js.native
  sealed trait handleFilter extends StObject
  @scala.inline
  def handleFilter: handleFilter = "handleFilter".asInstanceOf[handleFilter]
  
  @js.native
  sealed trait header extends StObject
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait hidden extends StObject
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hideDisabledOptions extends StObject
  @scala.inline
  def hideDisabledOptions: hideDisabledOptions = "hideDisabledOptions".asInstanceOf[hideDisabledOptions]
  
  @js.native
  sealed trait hideHeader extends StObject
  @scala.inline
  def hideHeader: hideHeader = "hideHeader".asInstanceOf[hideHeader]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with FormLayout
       with ListItemLayout
       with MenuMode
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hourStep extends StObject
  @scala.inline
  def hourStep: hourStep = "hourStep".asInstanceOf[hourStep]
  
  @js.native
  sealed trait hover
    extends StObject
       with CascaderExpandTrigger
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait id extends StObject
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait image extends StObject
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait info
    extends StObject
       with IconType
       with NoticeType
       with ResultStatusType
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait inherit extends StObject
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with FormLayout
       with MenuMode
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait inner extends StObject
  @scala.inline
  def inner: inner = "inner".asInstanceOf[inner]
  
  @js.native
  sealed trait input extends StObject
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait inputReadOnly extends StObject
  @scala.inline
  def inputReadOnly: inputReadOnly = "inputReadOnly".asInstanceOf[inputReadOnly]
  
  @js.native
  sealed trait `jump-next` extends StObject
  @scala.inline
  def `jump-next`: `jump-next` = "jump-next".asInstanceOf[`jump-next`]
  
  @js.native
  sealed trait `jump-prev` extends StObject
  @scala.inline
  def `jump-prev`: `jump-prev` = "jump-prev".asInstanceOf[`jump-prev`]
  
  @js.native
  sealed trait large
    extends StObject
       with ListSize
       with SpinSize
       with _AvatarSize
       with _SizeType
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait left
    extends StObject
       with DotPosition
       with FormLabelAlign
       with TabsPosition
       with TooltipPlacement
       with TransferDirection
       with _ExpandIconPosition
       with placementType
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait leftBottom
    extends StObject
       with TooltipPlacement
  @scala.inline
  def leftBottom: leftBottom = "leftBottom".asInstanceOf[leftBottom]
  
  @js.native
  sealed trait leftTop
    extends StObject
       with TooltipPlacement
  @scala.inline
  def leftTop: leftTop = "leftTop".asInstanceOf[leftTop]
  
  @js.native
  sealed trait lg
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def lg: lg = "lg".asInstanceOf[lg]
  
  @js.native
  sealed trait light
    extends StObject
       with MenuTheme
       with SiderTheme
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait lime extends StObject
  @scala.inline
  def lime: lime = "lime".asInstanceOf[lime]
  
  @js.native
  sealed trait line
    extends StObject
       with ProgressType
       with TabsType
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait link
    extends StObject
       with ButtonType
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait list extends StObject
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait listbox extends StObject
  @scala.inline
  def listbox: listbox = "listbox".asInstanceOf[listbox]
  
  @js.native
  sealed trait loading
    extends StObject
       with NoticeType
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait locale
    extends StObject
       with LocaleComponent
  @scala.inline
  def locale: locale = "locale".asInstanceOf[locale]
  
  @js.native
  sealed trait location extends StObject
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait ltr
    extends StObject
       with _DirectionType
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait magenta extends StObject
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait main extends StObject
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait marginLeft extends StObject
  @scala.inline
  def marginLeft: marginLeft = "marginLeft".asInstanceOf[marginLeft]
  
  @js.native
  sealed trait marginRight extends StObject
  @scala.inline
  def marginRight: marginRight = "marginRight".asInstanceOf[marginRight]
  
  @js.native
  sealed trait md
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def md: md = "md".asInstanceOf[md]
  
  @js.native
  sealed trait menu extends StObject
  @scala.inline
  def menu: menu = "menu".asInstanceOf[menu]
  
  @js.native
  sealed trait middle
    extends StObject
       with _SizeType
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait minuteStep extends StObject
  @scala.inline
  def minuteStep: minuteStep = "minuteStep".asInstanceOf[minuteStep]
  
  @js.native
  sealed trait mixed extends StObject
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait mode extends StObject
  @scala.inline
  def mode: mode = "mode".asInstanceOf[mode]
  
  @js.native
  sealed trait month
    extends StObject
       with CalendarMode
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait monthCellRender extends StObject
  @scala.inline
  def monthCellRender: monthCellRender = "monthCellRender".asInstanceOf[monthCellRender]
  
  @js.native
  sealed trait move extends StObject
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait multiple extends StObject
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait name extends StObject
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait navigation extends StObject
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @js.native
  sealed trait nest
    extends StObject
       with _ExpandType
  @scala.inline
  def nest: nest = "nest".asInstanceOf[nest]
  
  @js.native
  sealed trait next extends StObject
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait nextIcon extends StObject
  @scala.inline
  def nextIcon: nextIcon = "nextIcon".asInstanceOf[nextIcon]
  
  @js.native
  sealed trait no extends StObject
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait none
    extends StObject
       with _FlexType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends StObject
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait number
    extends StObject
       with _Formatter
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numeric extends StObject
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait off extends StObject
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait ok extends StObject
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait on extends StObject
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait onBlur extends StObject
  @scala.inline
  def onBlur: onBlur = "onBlur".asInstanceOf[onBlur]
  
  @js.native
  sealed trait onChange
    extends StObject
       with OmitAttrs
  @scala.inline
  def onChange: onChange = "onChange".asInstanceOf[onChange]
  
  @js.native
  sealed trait onClick extends StObject
  @scala.inline
  def onClick: onClick = "onClick".asInstanceOf[onClick]
  
  @js.native
  sealed trait onContextMenu extends StObject
  @scala.inline
  def onContextMenu: onContextMenu = "onContextMenu".asInstanceOf[onContextMenu]
  
  @js.native
  sealed trait onFocus extends StObject
  @scala.inline
  def onFocus: onFocus = "onFocus".asInstanceOf[onFocus]
  
  @js.native
  sealed trait onMouseDown extends StObject
  @scala.inline
  def onMouseDown: onMouseDown = "onMouseDown".asInstanceOf[onMouseDown]
  
  @js.native
  sealed trait onMouseEnter extends StObject
  @scala.inline
  def onMouseEnter: onMouseEnter = "onMouseEnter".asInstanceOf[onMouseEnter]
  
  @js.native
  sealed trait onMouseLeave extends StObject
  @scala.inline
  def onMouseLeave: onMouseLeave = "onMouseLeave".asInstanceOf[onMouseLeave]
  
  @js.native
  sealed trait onMouseUp extends StObject
  @scala.inline
  def onMouseUp: onMouseUp = "onMouseUp".asInstanceOf[onMouseUp]
  
  @js.native
  sealed trait onOk extends StObject
  @scala.inline
  def onOk: onOk = "onOk".asInstanceOf[onOk]
  
  @js.native
  sealed trait onOpenChange extends StObject
  @scala.inline
  def onOpenChange: onOpenChange = "onOpenChange".asInstanceOf[onOpenChange]
  
  @js.native
  sealed trait onPanelChange extends StObject
  @scala.inline
  def onPanelChange: onPanelChange = "onPanelChange".asInstanceOf[onPanelChange]
  
  @js.native
  sealed trait onSelect extends StObject
  @scala.inline
  def onSelect: onSelect = "onSelect".asInstanceOf[onSelect]
  
  @js.native
  sealed trait open extends StObject
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait optional extends StObject
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait orange extends StObject
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait other extends StObject
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait outline
    extends StObject
       with RadioGroupButtonStyle
  @scala.inline
  def outline: outline = "outline".asInstanceOf[outline]
  
  @js.native
  sealed trait page extends StObject
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait paginate
    extends StObject
       with TableAction
  @scala.inline
  def paginate: paginate = "paginate".asInstanceOf[paginate]
  
  @js.native
  sealed trait panelRender extends StObject
  @scala.inline
  def panelRender: panelRender = "panelRender".asInstanceOf[panelRender]
  
  @js.native
  sealed trait parallel extends StObject
  @scala.inline
  def parallel: parallel = "parallel".asInstanceOf[parallel]
  
  @js.native
  sealed trait part extends StObject
  @scala.inline
  def part: part = "part".asInstanceOf[part]
  
  @js.native
  sealed trait password extends StObject
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait patch_ extends StObject
  @scala.inline
  def patch_ : patch_ = "patch".asInstanceOf[patch_]
  
  @js.native
  sealed trait picker extends StObject
  @scala.inline
  def picker: picker = "picker".asInstanceOf[picker]
  
  @js.native
  sealed trait pickerRef extends StObject
  @scala.inline
  def pickerRef: pickerRef = "pickerRef".asInstanceOf[pickerRef]
  
  @js.native
  sealed trait picture
    extends StObject
       with UploadListType
  @scala.inline
  def picture: picture = "picture".asInstanceOf[picture]
  
  @js.native
  sealed trait `picture-card`
    extends StObject
       with UploadListType
  @scala.inline
  def `picture-card`: `picture-card` = "picture-card".asInstanceOf[`picture-card`]
  
  @js.native
  sealed trait pink extends StObject
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait placeholder extends StObject
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait polite extends StObject
  @scala.inline
  def polite: polite = "polite".asInstanceOf[polite]
  
  @js.native
  sealed trait popup extends StObject
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait popupStyle extends StObject
  @scala.inline
  def popupStyle: popupStyle = "popupStyle".asInstanceOf[popupStyle]
  
  @js.native
  sealed trait post_ extends StObject
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait prefixCls extends StObject
  @scala.inline
  def prefixCls: prefixCls = "prefixCls".asInstanceOf[prefixCls]
  
  @js.native
  sealed trait prev extends StObject
  @scala.inline
  def prev: prev = "prev".asInstanceOf[prev]
  
  @js.native
  sealed trait prevIcon extends StObject
  @scala.inline
  def prevIcon: prevIcon = "prevIcon".asInstanceOf[prevIcon]
  
  @js.native
  sealed trait previous extends StObject
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait primary
    extends StObject
       with ButtonType
       with DropdownButtonType
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait process extends StObject
  @scala.inline
  def process: process = "process".asInstanceOf[process]
  
  @js.native
  sealed trait processing extends StObject
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait purple extends StObject
  @scala.inline
  def purple: purple = "purple".asInstanceOf[purple]
  
  @js.native
  sealed trait put_ extends StObject
  @scala.inline
  def put_ : put_ = "put".asInstanceOf[put_]
  
  @js.native
  sealed trait radio
    extends StObject
       with RowSelectionType
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait range extends StObject
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait red extends StObject
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait removals extends StObject
  @scala.inline
  def removals: removals = "removals".asInstanceOf[removals]
  
  @js.native
  sealed trait `removals additions` extends StObject
  @scala.inline
  def `removals additions`: `removals additions` = ("removals additions").asInstanceOf[`removals additions`]
  
  @js.native
  sealed trait `removals text` extends StObject
  @scala.inline
  def `removals text`: `removals text` = ("removals text").asInstanceOf[`removals text`]
  
  @js.native
  sealed trait remove extends StObject
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait removed
    extends StObject
       with UploadFileStatus
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait renderExtraFooter extends StObject
  @scala.inline
  def renderExtraFooter: renderExtraFooter = "renderExtraFooter".asInstanceOf[renderExtraFooter]
  
  @js.native
  sealed trait reset
    extends StObject
       with ButtonHTMLType
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait responsive
    extends StObject
       with CollapseType
  @scala.inline
  def responsive: responsive = "responsive".asInstanceOf[responsive]
  
  @js.native
  sealed trait right
    extends StObject
       with DotPosition
       with FormLabelAlign
       with TabsPosition
       with TooltipPlacement
       with TransferDirection
       with _ExpandIconPosition
       with placementType
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rightBottom
    extends StObject
       with TooltipPlacement
  @scala.inline
  def rightBottom: rightBottom = "rightBottom".asInstanceOf[rightBottom]
  
  @js.native
  sealed trait rightTop
    extends StObject
       with TooltipPlacement
  @scala.inline
  def rightTop: rightTop = "rightTop".asInstanceOf[rightTop]
  
  @js.native
  sealed trait role extends StObject
  @scala.inline
  def role: role = "role".asInstanceOf[role]
  
  @js.native
  sealed trait round
    extends StObject
       with ButtonShape
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait row
    extends StObject
       with _ExpandType
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait rtl
    extends StObject
       with _DirectionType
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait scrollx
    extends StObject
       with CarouselEffect
  @scala.inline
  def scrollx: scrollx = "scrollx".asInstanceOf[scrollx]
  
  @js.native
  sealed trait search extends StObject
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait secondStep extends StObject
  @scala.inline
  def secondStep: secondStep = "secondStep".asInstanceOf[secondStep]
  
  @js.native
  sealed trait secondary
    extends StObject
       with BaseType
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @js.native
  sealed trait section extends StObject
  @scala.inline
  def section: section = "section".asInstanceOf[section]
  
  @js.native
  sealed trait select_
    extends StObject
       with UploadType
  @scala.inline
  def select_ : select_ = "select".asInstanceOf[select_]
  
  @js.native
  sealed trait send extends StObject
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait showHour extends StObject
  @scala.inline
  def showHour: showHour = "showHour".asInstanceOf[showHour]
  
  @js.native
  sealed trait showMinute extends StObject
  @scala.inline
  def showMinute: showMinute = "showMinute".asInstanceOf[showMinute]
  
  @js.native
  sealed trait showNow extends StObject
  @scala.inline
  def showNow: showNow = "showNow".asInstanceOf[showNow]
  
  @js.native
  sealed trait showSecond extends StObject
  @scala.inline
  def showSecond: showSecond = "showSecond".asInstanceOf[showSecond]
  
  @js.native
  sealed trait showTime extends StObject
  @scala.inline
  def showTime: showTime = "showTime".asInstanceOf[showTime]
  
  @js.native
  sealed trait showToday extends StObject
  @scala.inline
  def showToday: showToday = "showToday".asInstanceOf[showToday]
  
  @js.native
  sealed trait size
    extends StObject
       with OmitAttrs
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait sm
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def sm: sm = "sm".asInstanceOf[sm]
  
  @js.native
  sealed trait small
    extends StObject
       with CardSize
       with ListSize
       with ProgressSize
       with SpinSize
       with SwitchSize
       with _AvatarSize
       with _SizeType
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait solid
    extends StObject
       with RadioGroupButtonStyle
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait sort
    extends StObject
       with TableAction
  @scala.inline
  def sort: sort = "sort".asInstanceOf[sort]
  
  @js.native
  sealed trait `space-around` extends StObject
  @scala.inline
  def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  
  @js.native
  sealed trait `space-between` extends StObject
  @scala.inline
  def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  
  @js.native
  sealed trait spelling extends StObject
  @scala.inline
  def spelling: spelling = "spelling".asInstanceOf[spelling]
  
  @js.native
  sealed trait square extends StObject
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait start
    extends StObject
       with RibbonPlacement
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait step extends StObject
  @scala.inline
  def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait stretch extends StObject
  @scala.inline
  def stretch: stretch = "stretch".asInstanceOf[stretch]
  
  @js.native
  sealed trait style extends StObject
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait submit
    extends StObject
       with ButtonHTMLType
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait success
    extends StObject
       with BaseType
       with IconType
       with NoticeType
       with ResultStatusType
       with UploadFileStatus
       with ValidateStatus
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait suffixIcon extends StObject
  @scala.inline
  def suffixIcon: suffixIcon = "suffixIcon".asInstanceOf[suffixIcon]
  
  @js.native
  sealed trait superNextIcon extends StObject
  @scala.inline
  def superNextIcon: superNextIcon = "superNextIcon".asInstanceOf[superNextIcon]
  
  @js.native
  sealed trait superPrevIcon extends StObject
  @scala.inline
  def superPrevIcon: superPrevIcon = "superPrevIcon".asInstanceOf[superPrevIcon]
  
  @js.native
  sealed trait tabIndex extends StObject
  @scala.inline
  def tabIndex: tabIndex = "tabIndex".asInstanceOf[tabIndex]
  
  @js.native
  sealed trait tags extends StObject
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait tel extends StObject
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait `text additions` extends StObject
  @scala.inline
  def `text additions`: `text additions` = ("text additions").asInstanceOf[`text additions`]
  
  @js.native
  sealed trait `text removals` extends StObject
  @scala.inline
  def `text removals`: `text removals` = ("text removals").asInstanceOf[`text removals`]
  
  @js.native
  sealed trait text_
    extends StObject
       with ButtonType
       with UploadListType
  @scala.inline
  def text_ : text_ = "text".asInstanceOf[text_]
  
  @js.native
  sealed trait time extends StObject
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait top
    extends StObject
       with DotPosition
       with MentionPlacement
       with PaginationPosition
       with TabsPosition
       with TooltipPlacement
       with placementType
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topCenter
    extends StObject
       with Placement
       with TablePaginationPosition
  @scala.inline
  def topCenter: topCenter = "topCenter".asInstanceOf[topCenter]
  
  @js.native
  sealed trait topLeft
    extends StObject
       with NotificationPlacement
       with Placement
       with TablePaginationPosition
       with TooltipPlacement
  @scala.inline
  def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  
  @js.native
  sealed trait topRight
    extends StObject
       with NotificationPlacement
       with Placement
       with TablePaginationPosition
       with TooltipPlacement
  @scala.inline
  def topRight: topRight = "topRight".asInstanceOf[topRight]
  
  @js.native
  sealed trait transitionName extends StObject
  @scala.inline
  def transitionName: transitionName = "transitionName".asInstanceOf[transitionName]
  
  @js.native
  sealed trait tree extends StObject
  @scala.inline
  def tree: tree = "tree".asInstanceOf[tree]
  
  @js.native
  sealed trait up extends StObject
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait uploading
    extends StObject
       with UploadFileStatus
  @scala.inline
  def uploading: uploading = "uploading".asInstanceOf[uploading]
  
  @js.native
  sealed trait url extends StObject
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait use12Hours extends StObject
  @scala.inline
  def use12Hours: use12Hours = "use12Hours".asInstanceOf[use12Hours]
  
  @js.native
  sealed trait validating
    extends StObject
       with ValidateStatus
  @scala.inline
  def validating: validating = "validating".asInstanceOf[validating]
  
  @js.native
  sealed trait value extends StObject
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait vertical
    extends StObject
       with FormLayout
       with ListItemLayout
       with MenuMode
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `vertical-left`
    extends StObject
       with MenuMode
  @scala.inline
  def `vertical-left`: `vertical-left` = "vertical-left".asInstanceOf[`vertical-left`]
  
  @js.native
  sealed trait `vertical-right`
    extends StObject
       with MenuMode
  @scala.inline
  def `vertical-right`: `vertical-right` = "vertical-right".asInstanceOf[`vertical-right`]
  
  @js.native
  sealed trait volcano extends StObject
  @scala.inline
  def volcano: volcano = "volcano".asInstanceOf[volcano]
  
  @js.native
  sealed trait wait extends StObject
  
  @js.native
  sealed trait warning
    extends StObject
       with BaseType
       with IconType
       with NoticeType
       with ResultStatusType
       with ValidateStatus
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait week extends StObject
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait xl
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def xl: xl = "xl".asInstanceOf[xl]
  
  @js.native
  sealed trait xs
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def xs: xs = "xs".asInstanceOf[xs]
  
  @js.native
  sealed trait xxl
    extends StObject
       with Breakpoint
       with ColumnType
  @scala.inline
  def xxl: xxl = "xxl".asInstanceOf[xxl]
  
  @js.native
  sealed trait year
    extends StObject
       with CalendarMode
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait yellow extends StObject
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait yes extends StObject
  @scala.inline
  def yes: yes = "yes".asInstanceOf[yes]
}
