package typings.antd

import typings.antDesignIcons.componentsAntdIconMod.AntdIconProps
import typings.antd.formFormMod.FormProps
import typings.antd.formItemInputMod.FormItemInputMiscProps
import typings.antd.formItemInputMod.FormItemInputProps
import typings.antd.formUtilMod.FormInstance
import typings.antd.hookModalMod.HookModalProps
import typings.antd.hookModalMod.HookModalRef
import typings.antd.radioInterfaceMod.RadioGroupContextProps
import typings.antd.selectMod.SelectValue
import typings.moment.mod.Moment
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antdComponents extends antdProps {
  @scala.inline
  def ActionButton: ComponentType[ActionButtonProps] = js.constructorOf[typings.antd.actionButtonMod.default].asInstanceOf[typings.react.mod.ComponentType[ActionButtonProps]]
  @scala.inline
  def Affix: ComponentType[AffixProps] = js.constructorOf[typings.antd.affixMod.default].asInstanceOf[typings.react.mod.ComponentType[AffixProps]]
  @scala.inline
  def Alert: ComponentType[AlertProps] = js.constructorOf[typings.antd.alertMod.default].asInstanceOf[typings.react.mod.ComponentType[AlertProps]]
  @scala.inline
  def Anchor: ComponentType[AnchorProps] = js.constructorOf[typings.antd.anchorMod.default].asInstanceOf[typings.react.mod.ComponentType[AnchorProps]]
  @scala.inline
  def AnchorLink: ComponentType[AnchorLinkProps] = js.constructorOf[typings.antd.anchorLinkMod.default].asInstanceOf[typings.react.mod.ComponentType[AnchorLinkProps]]
  @scala.inline
  def Avatar: ComponentType[AvatarProps] = js.constructorOf[typings.antd.avatarMod.default].asInstanceOf[typings.react.mod.ComponentType[AvatarProps]]
  @scala.inline
  def BackTop: ComponentType[BackTopProps] = js.constructorOf[typings.antd.backTopMod.default].asInstanceOf[typings.react.mod.ComponentType[BackTopProps]]
  @scala.inline
  def Badge: ComponentType[BadgeProps] = js.constructorOf[typings.antd.badgeMod.default].asInstanceOf[typings.react.mod.ComponentType[BadgeProps]]
  @scala.inline
  def Base: ComponentType[BaseProps] = typings.antd.baseMod.default.asInstanceOf[typings.react.mod.ComponentType[BaseProps]]
  @scala.inline
  def Breadcrumb: ComponentType[BreadcrumbProps] = js.constructorOf[typings.antd.breadcrumbMod.default].asInstanceOf[typings.react.mod.ComponentType[BreadcrumbProps]]
  @scala.inline
  def BreadcrumbItem: ComponentType[BreadcrumbItemProps] = js.constructorOf[typings.antd.breadcrumbItemMod.default].asInstanceOf[typings.react.mod.ComponentType[BreadcrumbItemProps]]
  @scala.inline
  def BreadcrumbSeparator: ComponentType[js.Any] = js.constructorOf[typings.antd.breadcrumbSeparatorMod.default].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[typings.antd.buttonMod.default].asInstanceOf[typings.react.mod.ComponentType[ButtonProps]]
  @scala.inline
  def ButtonGroup: ComponentType[ButtonGroupProps] = typings.antd.buttonGroupMod.default.asInstanceOf[typings.react.mod.ComponentType[ButtonGroupProps]]
  @scala.inline
  def Calendar: ComponentType[CalendarProps[Moment]] = typings.antd.mod.Calendar.asInstanceOf[typings.react.mod.ComponentType[CalendarProps[typings.moment.mod.Moment]]]
  @scala.inline
  def Card: ComponentType[CardProps] = js.constructorOf[typings.antd.cardMod.default].asInstanceOf[typings.react.mod.ComponentType[CardProps]]
  @scala.inline
  def CardGrid: ComponentType[CardGridProps] = typings.antd.mod.Card.Grid.asInstanceOf[typings.react.mod.ComponentType[CardGridProps]]
  @scala.inline
  def CardMeta: ComponentType[CardMetaProps] = typings.antd.mod.Card.Meta.asInstanceOf[typings.react.mod.ComponentType[CardMetaProps]]
  @scala.inline
  def Carousel: ComponentType[CarouselProps] = js.constructorOf[typings.antd.carouselMod.default].asInstanceOf[typings.react.mod.ComponentType[CarouselProps]]
  @scala.inline
  def Cascader: ComponentType[CascaderProps] = js.constructorOf[typings.antd.cascaderMod.default].asInstanceOf[typings.react.mod.ComponentType[CascaderProps]]
  @scala.inline
  def Cell: ComponentType[CellProps] = typings.antd.cellMod.default.asInstanceOf[typings.react.mod.ComponentType[CellProps]]
  @scala.inline
  def CheckableTag: ComponentType[CheckableTagProps] = js.constructorOf[typings.antd.checkableTagMod.default].asInstanceOf[typings.react.mod.ComponentType[CheckableTagProps]]
  @scala.inline
  def Checkbox: ComponentType[CheckboxProps] = js.constructorOf[typings.antd.checkboxMod.default].asInstanceOf[typings.react.mod.ComponentType[CheckboxProps]]
  @scala.inline
  def Circle: ComponentType[CircleProps] = typings.antd.circleMod.default.asInstanceOf[typings.react.mod.ComponentType[CircleProps]]
  @scala.inline
  def ClearableLabeledInput: ComponentType[ClearableLabeledInputProps] = js.constructorOf[typings.antd.clearableLabeledInputMod.default].asInstanceOf[typings.react.mod.ComponentType[ClearableLabeledInputProps]]
  @scala.inline
  def Col: ComponentType[ColProps] = js.constructorOf[typings.antd.colMod.default].asInstanceOf[typings.react.mod.ComponentType[ColProps]]
  @scala.inline
  def Collapse: ComponentType[CollapseProps] = js.constructorOf[typings.antd.collapseMod.default].asInstanceOf[typings.react.mod.ComponentType[CollapseProps]]
  @scala.inline
  def CollapsePanel: ComponentType[CollapsePanelProps] = js.constructorOf[typings.antd.collapsePanelMod.default].asInstanceOf[typings.react.mod.ComponentType[CollapsePanelProps]]
  @scala.inline
  def Comment: ComponentType[CommentProps] = js.constructorOf[typings.antd.commentMod.default].asInstanceOf[typings.react.mod.ComponentType[CommentProps]]
  @scala.inline
  def ConfigConsumer: ComponentType[ConfigConsumerProps[typings.antd.contextMod.ConfigConsumerProps]] = typings.antd.configProviderMod.ConfigConsumer.asInstanceOf[typings.react.mod.ComponentType[ConfigConsumerProps[typings.antd.contextMod.ConfigConsumerProps]]]
  @scala.inline
  def ConfigProvider: ComponentType[ConfigProviderProps] = js.constructorOf[typings.antd.configProviderMod.default].asInstanceOf[typings.react.mod.ComponentType[ConfigProviderProps]]
  @scala.inline
  def ConfirmDialog: ComponentType[ConfirmDialogProps] = typings.antd.confirmDialogMod.default.asInstanceOf[typings.react.mod.ComponentType[ConfirmDialogProps]]
  @scala.inline
  def Countdown: ComponentType[CountdownProps] = js.constructorOf[typings.antd.countdownMod.default].asInstanceOf[typings.react.mod.ComponentType[CountdownProps]]
  @scala.inline
  def DatePicker: ComponentType[DatePickerProps[Moment]] = js.constructorOf[typings.antd.datePickerMod.default].asInstanceOf[typings.react.mod.ComponentType[DatePickerProps[typings.moment.mod.Moment]]]
  @scala.inline
  def DatePickerMonthPicker: ComponentType[DatePickerMonthPickerProps] = typings.antd.mod.DatePicker.MonthPicker.asInstanceOf[typings.react.mod.ComponentType[DatePickerMonthPickerProps]]
  @scala.inline
  def DatePickerRangePicker: ComponentType[DatePickerRangePickerProps[Moment]] = typings.antd.mod.DatePicker.RangePicker.asInstanceOf[typings.react.mod.ComponentType[DatePickerRangePickerProps[typings.moment.mod.Moment]]]
  @scala.inline
  def DatePickerTimePicker: ComponentType[DatePickerTimePickerProps] = typings.antd.mod.DatePicker.TimePicker.asInstanceOf[typings.react.mod.ComponentType[DatePickerTimePickerProps]]
  @scala.inline
  def DatePickerWeekPicker: ComponentType[DatePickerWeekPickerProps] = typings.antd.mod.DatePicker.WeekPicker.asInstanceOf[typings.react.mod.ComponentType[DatePickerWeekPickerProps]]
  @scala.inline
  def DatePickerYearPicker: ComponentType[DatePickerYearPickerProps] = typings.antd.mod.DatePicker.YearPicker.asInstanceOf[typings.react.mod.ComponentType[DatePickerYearPickerProps]]
  @scala.inline
  def Default: ComponentType[DefaultProps] = js.constructorOf[typings.antd.modalMod.defaultCls].asInstanceOf[typings.react.mod.ComponentType[DefaultProps]]
  @scala.inline
  def Descriptions: ComponentType[DescriptionsProps] = typings.antd.descriptionsMod.default.asInstanceOf[typings.react.mod.ComponentType[DescriptionsProps]]
  @scala.inline
  def DescriptionsItem: ComponentType[DescriptionsItemProps] = typings.antd.mod.Descriptions.Item.asInstanceOf[typings.react.mod.ComponentType[DescriptionsItemProps]]
  @scala.inline
  def DirectoryTree: ComponentType[DirectoryTreeProps] = js.constructorOf[typings.antd.directoryTreeMod.default].asInstanceOf[typings.react.mod.ComponentType[DirectoryTreeProps]]
  @scala.inline
  def Divider: ComponentType[DividerProps] = typings.antd.dividerMod.default.asInstanceOf[typings.react.mod.ComponentType[DividerProps]]
  @scala.inline
  def Dragger: ComponentType[DraggerProps] = js.constructorOf[typings.antd.draggerMod.default].asInstanceOf[typings.react.mod.ComponentType[DraggerProps]]
  @scala.inline
  def Drawer: ComponentType[DrawerProps] = typings.antd.drawerMod.default.asInstanceOf[typings.react.mod.ComponentType[DrawerProps]]
  @scala.inline
  def Dropdown: ComponentType[DropdownProps] = js.constructorOf[typings.antd.dropdownMod.default].asInstanceOf[typings.react.mod.ComponentType[DropdownProps]]
  @scala.inline
  def DropdownButton: ComponentType[DropdownButtonProps] = js.constructorOf[typings.antd.dropdownButtonMod.default].asInstanceOf[typings.react.mod.ComponentType[DropdownButtonProps]]
  @scala.inline
  def Editable: ComponentType[EditableProps] = js.constructorOf[typings.antd.editableMod.default].asInstanceOf[typings.react.mod.ComponentType[EditableProps]]
  @scala.inline
  def Element: ComponentType[ElementProps] = js.constructorOf[typings.antd.elementMod.default].asInstanceOf[typings.react.mod.ComponentType[ElementProps]]
  @scala.inline
  def Empty: ComponentType[EmptyProps] = typings.antd.emptyMod.default.asInstanceOf[typings.react.mod.ComponentType[EmptyProps]]
  @scala.inline
  def ErrorBoundary: ComponentType[ErrorBoundaryProps] = js.constructorOf[typings.antd.errorBoundaryMod.default].asInstanceOf[typings.react.mod.ComponentType[ErrorBoundaryProps]]
  @scala.inline
  def FilterDropdown[RecordType]: ComponentType[FilterDropdownProps[RecordType]] = typings.antd.filterDropdownMod.default.asInstanceOf[typings.react.mod.ComponentType[FilterDropdownProps[RecordType]]]
  @scala.inline
  def FilterWrapper: ComponentType[FilterWrapperProps] = typings.antd.filterWrapperMod.default.asInstanceOf[typings.react.mod.ComponentType[FilterWrapperProps]]
  @scala.inline
  def Form: ComponentType[FormProps with RefAttributes[FormInstance]] = typings.antd.formMod.default.asInstanceOf[typings.react.mod.ComponentType[
  typings.antd.formFormMod.FormProps with typings.react.mod.RefAttributes[typings.antd.formUtilMod.FormInstance]]]
  @scala.inline
  def FormItem: ComponentType[FormItemProps] = typings.antd.formItemMod.default.asInstanceOf[typings.react.mod.ComponentType[FormItemProps]]
  @scala.inline
  def FormItemInput: ComponentType[FormItemInputProps with FormItemInputMiscProps] = typings.antd.formItemInputMod.default.asInstanceOf[typings.react.mod.ComponentType[
  typings.antd.formItemInputMod.FormItemInputProps with typings.antd.formItemInputMod.FormItemInputMiscProps]]
  @scala.inline
  def FormItemLabel: ComponentType[FormItemLabelProps] = typings.antd.formItemLabelMod.default.asInstanceOf[typings.react.mod.ComponentType[FormItemLabelProps]]
  @scala.inline
  def FormList: ComponentType[FormListProps] = typings.antd.formListMod.default.asInstanceOf[typings.react.mod.ComponentType[FormListProps]]
  @scala.inline
  def FormProvider: ComponentType[FormProviderProps] = typings.antd.formContextMod.FormProvider.asInstanceOf[typings.react.mod.ComponentType[FormProviderProps]]
  @scala.inline
  def Grid: ComponentType[GridProps] = typings.antd.gridMod.default.asInstanceOf[typings.react.mod.ComponentType[GridProps]]
  @scala.inline
  def Group: ComponentType[GroupProps] = typings.antd.inputGroupMod.default.asInstanceOf[typings.react.mod.ComponentType[GroupProps]]
  @scala.inline
  def Header[DateType]: ComponentType[HeaderProps[DateType]] = typings.antd.headerMod.default.asInstanceOf[typings.react.mod.ComponentType[HeaderProps[DateType]]]
  @scala.inline
  def HookModal: ComponentType[HookModalProps with RefAttributes[HookModalRef]] = typings.antd.hookModalMod.default.asInstanceOf[typings.react.mod.ComponentType[
  typings.antd.hookModalMod.HookModalProps with typings.react.mod.RefAttributes[typings.antd.hookModalMod.HookModalRef]]]
  @scala.inline
  def IconMapError: ComponentType[AntdIconProps with RefAttributes[HTMLSpanElement]] = typings.antd.resultMod.IconMap.error.asInstanceOf[typings.react.mod.ComponentType[
  typings.antDesignIcons.componentsAntdIconMod.AntdIconProps with typings.react.mod.RefAttributes[typings.std.HTMLSpanElement]]]
  @scala.inline
  def IconMapInfo: ComponentType[AntdIconProps with RefAttributes[HTMLSpanElement]] = typings.antd.resultMod.IconMap.info.asInstanceOf[typings.react.mod.ComponentType[
  typings.antDesignIcons.componentsAntdIconMod.AntdIconProps with typings.react.mod.RefAttributes[typings.std.HTMLSpanElement]]]
  @scala.inline
  def IconMapSuccess: ComponentType[AntdIconProps with RefAttributes[HTMLSpanElement]] = typings.antd.resultMod.IconMap.success.asInstanceOf[typings.react.mod.ComponentType[
  typings.antDesignIcons.componentsAntdIconMod.AntdIconProps with typings.react.mod.RefAttributes[typings.std.HTMLSpanElement]]]
  @scala.inline
  def IconMapWarning: ComponentType[AntdIconProps with RefAttributes[HTMLSpanElement]] = typings.antd.resultMod.IconMap.warning.asInstanceOf[typings.react.mod.ComponentType[
  typings.antDesignIcons.componentsAntdIconMod.AntdIconProps with typings.react.mod.RefAttributes[typings.std.HTMLSpanElement]]]
  @scala.inline
  def Input: ComponentType[InputProps] = js.constructorOf[typings.antd.inputMod.default].asInstanceOf[typings.react.mod.ComponentType[InputProps]]
  @scala.inline
  def InputGroup: ComponentType[InputGroupProps] = typings.antd.mod.Input.Group.asInstanceOf[typings.react.mod.ComponentType[InputGroupProps]]
  @scala.inline
  def InputNumber: ComponentType[InputNumberProps] = js.constructorOf[typings.antd.inputNumberMod.default].asInstanceOf[typings.react.mod.ComponentType[InputNumberProps]]
  @scala.inline
  def Item: ComponentType[ItemProps] = js.constructorOf[typings.antd.listItemMod.default].asInstanceOf[typings.react.mod.ComponentType[ItemProps]]
  @scala.inline
  def ItemMeta: ComponentType[ItemMetaProps] = typings.antd.listItemMod.default.asInstanceOf[js.Dynamic].selectDynamic("Meta").asInstanceOf[typings.react.mod.ComponentType[ItemMetaProps]]
  @scala.inline
  def Layout: ComponentType[LayoutProps] = js.constructorOf[typings.antd.layoutMod.default].asInstanceOf[typings.react.mod.ComponentType[LayoutProps]]
  @scala.inline
  def LayoutContent: ComponentType[LayoutContentProps] = typings.antd.mod.Layout.Content.asInstanceOf[typings.react.mod.ComponentType[LayoutContentProps]]
  @scala.inline
  def LayoutFooter: ComponentType[LayoutFooterProps] = typings.antd.mod.Layout.Footer.asInstanceOf[typings.react.mod.ComponentType[LayoutFooterProps]]
  @scala.inline
  def LayoutHeader: ComponentType[LayoutHeaderProps] = typings.antd.mod.Layout.Header.asInstanceOf[typings.react.mod.ComponentType[LayoutHeaderProps]]
  @scala.inline
  def LayoutSider: ComponentType[LayoutSiderProps] = typings.antd.mod.Layout.Sider.asInstanceOf[typings.react.mod.ComponentType[LayoutSiderProps]]
  @scala.inline
  def Line: ComponentType[LineProps] = typings.antd.lineMod.default.asInstanceOf[typings.react.mod.ComponentType[LineProps]]
  @scala.inline
  def List[T]: ComponentType[ListProps[T]] = js.constructorOf[typings.antd.listMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[ListProps[T]]]
  @scala.inline
  def ListItem: ComponentType[js.Any] = js.constructorOf[typings.antd.transferListItemMod.default].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def LocaleProvider: ComponentType[LocaleProviderProps] = js.constructorOf[typings.antd.localeProviderMod.default].asInstanceOf[typings.react.mod.ComponentType[LocaleProviderProps]]
  @scala.inline
  def LocaleReceiver: ComponentType[LocaleReceiverProps] = js.constructorOf[typings.antd.localeReceiverMod.default].asInstanceOf[typings.react.mod.ComponentType[LocaleReceiverProps]]
  @scala.inline
  def Mentions: ComponentType[MentionsProps] = js.constructorOf[typings.antd.mentionsMod.default].asInstanceOf[typings.react.mod.ComponentType[MentionsProps]]
  @scala.inline
  def MentionsOption: ComponentType[MentionsOptionProps] = typings.antd.mod.Mentions.Option.asInstanceOf[typings.react.mod.ComponentType[MentionsOptionProps]]
  @scala.inline
  def Menu: ComponentType[MenuProps] = js.constructorOf[typings.antd.menuMod.default].asInstanceOf[typings.react.mod.ComponentType[MenuProps]]
  @scala.inline
  def MenuDivider: ComponentType[MenuDividerProps] = typings.antd.mod.Menu.Divider.asInstanceOf[typings.react.mod.ComponentType[MenuDividerProps]]
  @scala.inline
  def MenuItem: ComponentType[MenuItemProps] = js.constructorOf[typings.antd.menuItemMod.default].asInstanceOf[typings.react.mod.ComponentType[MenuItemProps]]
  @scala.inline
  def Meta: ComponentType[MetaProps] = typings.antd.metaMod.default.asInstanceOf[typings.react.mod.ComponentType[MetaProps]]
  @scala.inline
  def MiniSelect: ComponentType[js.Any] = js.constructorOf[typings.antd.miniSelectMod.default].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def Modal: ComponentType[ModalProps] = js.constructorOf[typings.antd.modalModalMod.default].asInstanceOf[typings.react.mod.ComponentType[ModalProps]]
  @scala.inline
  def MonthPicker: ComponentType[MonthPickerProps] = typings.antd.datePickerMod.default.MonthPicker.asInstanceOf[typings.react.mod.ComponentType[MonthPickerProps]]
  @scala.inline
  def Number: ComponentType[NumberProps] = typings.antd.numberMod.default.asInstanceOf[typings.react.mod.ComponentType[NumberProps]]
  @scala.inline
  def Operation: ComponentType[OperationProps] = typings.antd.operationMod.default.asInstanceOf[typings.react.mod.ComponentType[OperationProps]]
  @scala.inline
  def Option: ComponentType[OptionProps] = typings.antd.mentionsMod.default.Option.asInstanceOf[typings.react.mod.ComponentType[OptionProps]]
  @scala.inline
  def PageHeader: ComponentType[PageHeaderProps] = typings.antd.pageHeaderMod.default.asInstanceOf[typings.react.mod.ComponentType[PageHeaderProps]]
  @scala.inline
  def Pagination: ComponentType[PaginationProps] = js.constructorOf[typings.antd.paginationMod.default].asInstanceOf[typings.react.mod.ComponentType[PaginationProps]]
  @scala.inline
  def Paragraph: ComponentType[ParagraphProps] = typings.antd.typographyParagraphMod.default.asInstanceOf[typings.react.mod.ComponentType[ParagraphProps]]
  @scala.inline
  def Password: ComponentType[PasswordProps] = js.constructorOf[typings.antd.passwordMod.default].asInstanceOf[typings.react.mod.ComponentType[PasswordProps]]
  @scala.inline
  def Popconfirm: ComponentType[PopconfirmProps] = js.constructorOf[typings.antd.popconfirmMod.default].asInstanceOf[typings.react.mod.ComponentType[PopconfirmProps]]
  @scala.inline
  def Popover: ComponentType[PopoverProps] = js.constructorOf[typings.antd.popoverMod.default].asInstanceOf[typings.react.mod.ComponentType[PopoverProps]]
  @scala.inline
  def Progress: ComponentType[ProgressProps] = js.constructorOf[typings.antd.progressMod.default].asInstanceOf[typings.react.mod.ComponentType[ProgressProps]]
  @scala.inline
  def Radio: ComponentType[RadioProps] = js.constructorOf[typings.antd.radioMod.default].asInstanceOf[typings.react.mod.ComponentType[RadioProps]]
  @scala.inline
  def RadioButton: ComponentType[RadioButtonProps] = typings.antd.mod.Radio.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[typings.react.mod.ComponentType[RadioButtonProps]]
  @scala.inline
  def RadioGroupContextProvider: ComponentType[RadioGroupContextProviderProps[RadioGroupContextProps | Null]] = typings.antd.radioContextMod.RadioGroupContextProvider.asInstanceOf[typings.react.mod.ComponentType[
  RadioGroupContextProviderProps[typings.antd.radioInterfaceMod.RadioGroupContextProps | scala.Null]]]
  @scala.inline
  def RangePicker: ComponentType[RangePickerProps[Moment]] = typings.antd.datePickerMod.default.RangePicker.asInstanceOf[typings.react.mod.ComponentType[RangePickerProps[typings.moment.mod.Moment]]]
  @scala.inline
  def Rate: ComponentType[RateProps] = js.constructorOf[typings.antd.rateMod.default].asInstanceOf[typings.react.mod.ComponentType[RateProps]]
  @scala.inline
  def RenderListBody: ComponentType[RenderListBodyProps] = typings.antd.renderListBodyMod.default.asInstanceOf[typings.react.mod.ComponentType[RenderListBodyProps]]
  @scala.inline
  def ResizableTextArea: ComponentType[ResizableTextAreaProps] = js.constructorOf[typings.antd.resizableTextAreaMod.default].asInstanceOf[typings.react.mod.ComponentType[ResizableTextAreaProps]]
  @scala.inline
  def Result: ComponentType[ResultProps] = typings.antd.resultMod.default.asInstanceOf[typings.react.mod.ComponentType[ResultProps]]
  @scala.inline
  def Row: ComponentType[RowProps] = js.constructorOf[typings.antd.libRowMod.default].asInstanceOf[typings.react.mod.ComponentType[RowProps]]
  @scala.inline
  def ScrollNumber: ComponentType[ScrollNumberProps] = js.constructorOf[typings.antd.scrollNumberMod.default].asInstanceOf[typings.react.mod.ComponentType[ScrollNumberProps]]
  @scala.inline
  def Search: ComponentType[SearchProps] = js.constructorOf[typings.antd.searchMod.default].asInstanceOf[typings.react.mod.ComponentType[SearchProps]]
  @scala.inline
  def Select[ValueType /* <: SelectValue */]: ComponentType[SelectProps[ValueType]] = js.constructorOf[typings.antd.selectMod.default[ValueType]].asInstanceOf[typings.react.mod.ComponentType[SelectProps[ValueType]]]
  @scala.inline
  def Sider: ComponentType[js.Object] = js.constructorOf[typings.antd.siderMod.default].asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def SizeContextProvider: ComponentType[SizeContextProviderProps] = typings.antd.sizeContextMod.SizeContextProvider.asInstanceOf[typings.react.mod.ComponentType[SizeContextProviderProps]]
  @scala.inline
  def Skeleton: ComponentType[SkeletonProps] = js.constructorOf[typings.antd.skeletonMod.default].asInstanceOf[typings.react.mod.ComponentType[SkeletonProps]]
  @scala.inline
  def Slider: ComponentType[SliderProps] = js.constructorOf[typings.antd.sliderMod.default].asInstanceOf[typings.react.mod.ComponentType[SliderProps]]
  @scala.inline
  def Spin: ComponentType[SpinProps] = js.constructorOf[typings.antd.spinMod.default].asInstanceOf[typings.react.mod.ComponentType[SpinProps]]
  @scala.inline
  def Statistic: ComponentType[StatisticProps[typings.antd.statisticStatisticMod.StatisticProps]] = typings.antd.statisticMod.default.asInstanceOf[typings.react.mod.ComponentType[StatisticProps[typings.antd.statisticStatisticMod.StatisticProps]]]
  @scala.inline
  def Steps: ComponentType[StepsProps] = js.constructorOf[typings.antd.libStepsMod.default].asInstanceOf[typings.react.mod.ComponentType[StepsProps]]
  @scala.inline
  def StepsStep: ComponentType[StepsStepProps] = typings.antd.mod.Steps.Step.asInstanceOf[typings.react.mod.ComponentType[StepsStepProps]]
  @scala.inline
  def SubMenu: ComponentType[SubMenuProps] = js.constructorOf[typings.antd.subMenuMod.default].asInstanceOf[typings.react.mod.ComponentType[SubMenuProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.antd.switchMod.default].asInstanceOf[typings.react.mod.ComponentType[SwitchProps]]
  @scala.inline
  def TabBar: ComponentType[TabBarProps] = js.constructorOf[typings.antd.tabBarMod.default].asInstanceOf[typings.react.mod.ComponentType[TabBarProps]]
  @scala.inline
  def TabPane: ComponentType[TabPaneProps] = typings.antd.tabsMod.default.TabPane.asInstanceOf[typings.react.mod.ComponentType[TabPaneProps]]
  @scala.inline
  def Table[RecordType /* <: js.Object */]: ComponentType[TableProps[RecordType]] = typings.antd.tableMod.default.asInstanceOf[typings.react.mod.ComponentType[TableProps[RecordType]]]
  @scala.inline
  def Tabs: ComponentType[TabsProps] = js.constructorOf[typings.antd.tabsMod.default].asInstanceOf[typings.react.mod.ComponentType[TabsProps]]
  @scala.inline
  def TabsTabPane: ComponentType[TabsTabPaneProps] = typings.antd.mod.Tabs.TabPane.asInstanceOf[typings.react.mod.ComponentType[TabsTabPaneProps]]
  @scala.inline
  def Tag: ComponentType[TagProps] = js.constructorOf[typings.antd.tagMod.default].asInstanceOf[typings.react.mod.ComponentType[TagProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.antd.textMod.default.asInstanceOf[typings.react.mod.ComponentType[TextProps]]
  @scala.inline
  def TextArea: ComponentType[TextAreaProps] = js.constructorOf[typings.antd.textAreaMod.default].asInstanceOf[typings.react.mod.ComponentType[TextAreaProps]]
  @scala.inline
  def TimePicker: ComponentType[TimePickerProps] = typings.antd.datePickerMod.default.TimePicker.asInstanceOf[typings.react.mod.ComponentType[TimePickerProps]]
  @scala.inline
  def Timeline: ComponentType[TimelineProps] = js.constructorOf[typings.antd.timelineMod.default].asInstanceOf[typings.react.mod.ComponentType[TimelineProps]]
  @scala.inline
  def TimelineItem: ComponentType[TimelineItemProps] = typings.antd.timelineItemMod.default.asInstanceOf[typings.react.mod.ComponentType[TimelineItemProps]]
  @scala.inline
  def Title: ComponentType[TitleProps] = typings.antd.typographyTitleMod.default.asInstanceOf[typings.react.mod.ComponentType[TitleProps]]
  @scala.inline
  def Tooltip: ComponentType[TooltipProps] = js.constructorOf[typings.antd.tooltipMod.default].asInstanceOf[typings.react.mod.ComponentType[TooltipProps]]
  @scala.inline
  def TransButton: ComponentType[TransButtonProps] = js.constructorOf[typings.antd.transButtonMod.default].asInstanceOf[typings.react.mod.ComponentType[TransButtonProps]]
  @scala.inline
  def Transfer: ComponentType[TransferProps] = js.constructorOf[typings.antd.transferMod.default].asInstanceOf[typings.react.mod.ComponentType[TransferProps]]
  @scala.inline
  def TransferOperation: ComponentType[TransferOperationProps] = typings.antd.mod.Transfer.asInstanceOf[js.Dynamic].selectDynamic("Operation").asInstanceOf[typings.react.mod.ComponentType[TransferOperationProps]]
  @scala.inline
  def Tree: ComponentType[TreeProps] = js.constructorOf[typings.antd.treeMod.default].asInstanceOf[typings.react.mod.ComponentType[TreeProps]]
  @scala.inline
  def TreeNode: ComponentType[TreeNodeProps] = typings.antd.treeTreeMod.default.TreeNode.asInstanceOf[typings.react.mod.ComponentType[TreeNodeProps]]
  @scala.inline
  def TreeSelect[T]: ComponentType[TreeSelectProps[T]] = js.constructorOf[typings.antd.treeSelectMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[TreeSelectProps[T]]]
  @scala.inline
  def TreeSelectTreeNode: ComponentType[TreeSelectTreeNodeProps] = typings.antd.mod.TreeSelect.TreeNode.asInstanceOf[typings.react.mod.ComponentType[TreeSelectTreeNodeProps]]
  @scala.inline
  def TreeTreeNode: ComponentType[TreeTreeNodeProps] = typings.antd.mod.Tree.TreeNode.asInstanceOf[typings.react.mod.ComponentType[TreeTreeNodeProps]]
  @scala.inline
  def Typography: ComponentType[TypographyProps] = typings.antd.typographyTypographyMod.default.asInstanceOf[typings.react.mod.ComponentType[TypographyProps]]
  @scala.inline
  def Upload: ComponentType[UploadProps] = js.constructorOf[typings.antd.uploadMod.default].asInstanceOf[typings.react.mod.ComponentType[UploadProps]]
  @scala.inline
  def UploadList: ComponentType[UploadListProps] = js.constructorOf[typings.antd.uploadListMod.default].asInstanceOf[typings.react.mod.ComponentType[UploadListProps]]
  @scala.inline
  def Wave: ComponentType[WaveProps] = js.constructorOf[typings.antd.waveMod.default].asInstanceOf[typings.react.mod.ComponentType[WaveProps]]
  @scala.inline
  def WeekPicker: ComponentType[WeekPickerProps] = typings.antd.datePickerMod.default.WeekPicker.asInstanceOf[typings.react.mod.ComponentType[WeekPickerProps]]
  @scala.inline
  def YearPicker: ComponentType[YearPickerProps] = typings.antd.datePickerMod.default.YearPicker.asInstanceOf[typings.react.mod.ComponentType[YearPickerProps]]
}

