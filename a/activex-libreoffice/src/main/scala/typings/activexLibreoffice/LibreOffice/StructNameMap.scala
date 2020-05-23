package typings.activexLibreoffice.LibreOffice

import typings.activexLibreoffice.com_.sun.star.accessibility.AccessibleEventObject
import typings.activexLibreoffice.com_.sun.star.accessibility.AccessibleRelation
import typings.activexLibreoffice.com_.sun.star.accessibility.AccessibleTableModelChange
import typings.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typings.activexLibreoffice.com_.sun.star.animations.Event
import typings.activexLibreoffice.com_.sun.star.animations.TargetProperties
import typings.activexLibreoffice.com_.sun.star.animations.TimeFilterPair
import typings.activexLibreoffice.com_.sun.star.animations.ValuePair
import typings.activexLibreoffice.com_.sun.star.awt.ActionEvent
import typings.activexLibreoffice.com_.sun.star.awt.AdjustmentEvent
import typings.activexLibreoffice.com_.sun.star.awt.DeviceInfo
import typings.activexLibreoffice.com_.sun.star.awt.DockingData
import typings.activexLibreoffice.com_.sun.star.awt.DockingEvent
import typings.activexLibreoffice.com_.sun.star.awt.EndDockingEvent
import typings.activexLibreoffice.com_.sun.star.awt.EndPopupModeEvent
import typings.activexLibreoffice.com_.sun.star.awt.EnhancedMouseEvent
import typings.activexLibreoffice.com_.sun.star.awt.FocusEvent
import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.awt.Gradient
import typings.activexLibreoffice.com_.sun.star.awt.InputEvent
import typings.activexLibreoffice.com_.sun.star.awt.ItemEvent
import typings.activexLibreoffice.com_.sun.star.awt.ItemListEvent
import typings.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typings.activexLibreoffice.com_.sun.star.awt.KeyStroke
import typings.activexLibreoffice.com_.sun.star.awt.MenuEvent
import typings.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typings.activexLibreoffice.com_.sun.star.awt.PaintEvent
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Selection
import typings.activexLibreoffice.com_.sun.star.awt.SimpleFontMetric
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.SpinEvent
import typings.activexLibreoffice.com_.sun.star.awt.SystemDependentXWindow
import typings.activexLibreoffice.com_.sun.star.awt.TextEvent
import typings.activexLibreoffice.com_.sun.star.awt.VclContainerEvent
import typings.activexLibreoffice.com_.sun.star.awt.WindowDescriptor
import typings.activexLibreoffice.com_.sun.star.awt.WindowEvent
import typings.activexLibreoffice.com_.sun.star.awt.grid.GridColumnEvent
import typings.activexLibreoffice.com_.sun.star.awt.grid.GridDataEvent
import typings.activexLibreoffice.com_.sun.star.awt.grid.GridSelectionEvent
import typings.activexLibreoffice.com_.sun.star.awt.tab.TabPageActivatedEvent
import typings.activexLibreoffice.com_.sun.star.awt.tree.TreeDataModelEvent
import typings.activexLibreoffice.com_.sun.star.awt.tree.TreeExpansionEvent
import typings.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyChangeEvent
import typings.activexLibreoffice.com_.sun.star.beans.PropertySetInfoChangeEvent
import typings.activexLibreoffice.com_.sun.star.beans.PropertyStateChangeEvent
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.bridge.ProtocolProperty
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.Currency
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.Date
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.Decimal
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.NamedArgument
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.PropertyPutArgument
import typings.activexLibreoffice.com_.sun.star.bridge.oleautomation.SCode
import typings.activexLibreoffice.com_.sun.star.chart.ChartDataChangeEvent
import typings.activexLibreoffice.com_.sun.star.chart.ChartDataRow
import typings.activexLibreoffice.com_.sun.star.chart.ChartDataValue
import typings.activexLibreoffice.com_.sun.star.chart.ChartSeriesAddress
import typings.activexLibreoffice.com_.sun.star.chart.TimeIncrement
import typings.activexLibreoffice.com_.sun.star.chart.TimeInterval
import typings.activexLibreoffice.com_.sun.star.chart2.DataPointLabel
import typings.activexLibreoffice.com_.sun.star.chart2.FillBitmap
import typings.activexLibreoffice.com_.sun.star.chart2.IncrementData
import typings.activexLibreoffice.com_.sun.star.chart2.InterpretedData
import typings.activexLibreoffice.com_.sun.star.chart2.LightSource
import typings.activexLibreoffice.com_.sun.star.chart2.RelativePosition
import typings.activexLibreoffice.com_.sun.star.chart2.RelativeSize
import typings.activexLibreoffice.com_.sun.star.chart2.ScaleData
import typings.activexLibreoffice.com_.sun.star.chart2.SubIncrement
import typings.activexLibreoffice.com_.sun.star.chart2.Symbol
import typings.activexLibreoffice.com_.sun.star.chart2.data.HighlightedRange
import typings.activexLibreoffice.com_.sun.star.configuration.backend.ComponentChangeEvent
import typings.activexLibreoffice.com_.sun.star.configuration.backend.PropertyInfo
import typings.activexLibreoffice.com_.sun.star.configuration.backend.TemplateIdentifier
import typings.activexLibreoffice.com_.sun.star.connection.SocketPermission
import typings.activexLibreoffice.com_.sun.star.container.ContainerEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard.ClipboardEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragGestureEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceDragEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceDropEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDragEnterEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDragEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDropEvent
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetEvent
import typings.activexLibreoffice.com_.sun.star.deployment.UpdateInformationEntry
import typings.activexLibreoffice.com_.sun.star.document.CmisProperty
import typings.activexLibreoffice.com_.sun.star.document.CmisVersion
import typings.activexLibreoffice.com_.sun.star.document.DocumentEvent
import typings.activexLibreoffice.com_.sun.star.document.EventObject
import typings.activexLibreoffice.com_.sun.star.document.UndoManagerEvent
import typings.activexLibreoffice.com_.sun.star.drawing.BezierPoint
import typings.activexLibreoffice.com_.sun.star.drawing.BoundVolume
import typings.activexLibreoffice.com_.sun.star.drawing.CameraGeometry
import typings.activexLibreoffice.com_.sun.star.drawing.Direction3D
import typings.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeAdjustmentValue
import typings.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeParameter
import typings.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeParameterPair
import typings.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeSegment
import typings.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeTextFrame
import typings.activexLibreoffice.com_.sun.star.drawing.GluePoint
import typings.activexLibreoffice.com_.sun.star.drawing.GluePoint2
import typings.activexLibreoffice.com_.sun.star.drawing.Hatch
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix3
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix4
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine3
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine4
import typings.activexLibreoffice.com_.sun.star.drawing.LineDash
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonShape3D
import typings.activexLibreoffice.com_.sun.star.drawing.Position3D
import typings.activexLibreoffice.com_.sun.star.drawing.framework.ConfigurationChangeEvent
import typings.activexLibreoffice.com_.sun.star.drawing.framework.TabBarButton
import typings.activexLibreoffice.com_.sun.star.embed.InsertedObjectInfo
import typings.activexLibreoffice.com_.sun.star.embed.VerbDescriptor
import typings.activexLibreoffice.com_.sun.star.embed.VisualRepresentation
import typings.activexLibreoffice.com_.sun.star.form.DatabaseDeleteEvent
import typings.activexLibreoffice.com_.sun.star.form.DatabaseParameterEvent
import typings.activexLibreoffice.com_.sun.star.form.ErrorEvent
import typings.activexLibreoffice.com_.sun.star.form.binding.ListEntryEvent
import typings.activexLibreoffice.com_.sun.star.form.runtime.FeatureState
import typings.activexLibreoffice.com_.sun.star.form.runtime.FilterEvent
import typings.activexLibreoffice.com_.sun.star.formula.SymbolDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.BorderWidths
import typings.activexLibreoffice.com_.sun.star.frame.ControlCommand
import typings.activexLibreoffice.com_.sun.star.frame.ControlEvent
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.DispatchInformation
import typings.activexLibreoffice.com_.sun.star.frame.DispatchResultEvent
import typings.activexLibreoffice.com_.sun.star.frame.DispatchStatement
import typings.activexLibreoffice.com_.sun.star.frame.FeatureStateEvent
import typings.activexLibreoffice.com_.sun.star.frame.FrameActionEvent
import typings.activexLibreoffice.com_.sun.star.frame.TitleChangedEvent
import typings.activexLibreoffice.com_.sun.star.frame.status.ClipboardFormats
import typings.activexLibreoffice.com_.sun.star.frame.status.FontHeight
import typings.activexLibreoffice.com_.sun.star.frame.status.ItemStatus
import typings.activexLibreoffice.com_.sun.star.frame.status.LeftRightMargin
import typings.activexLibreoffice.com_.sun.star.frame.status.LeftRightMarginScale
import typings.activexLibreoffice.com_.sun.star.frame.status.Template
import typings.activexLibreoffice.com_.sun.star.frame.status.UpperLowerMargin
import typings.activexLibreoffice.com_.sun.star.frame.status.UpperLowerMarginScale
import typings.activexLibreoffice.com_.sun.star.frame.status.Verb
import typings.activexLibreoffice.com_.sun.star.frame.status.Visibility
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix3D
import typings.activexLibreoffice.com_.sun.star.geometry.EllipticalArc
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerBezierSegment2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle3D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.activexLibreoffice.com_.sun.star.i18n.Boundary
import typings.activexLibreoffice.com_.sun.star.i18n.Calendar
import typings.activexLibreoffice.com_.sun.star.i18n.Calendar2
import typings.activexLibreoffice.com_.sun.star.i18n.CalendarItem
import typings.activexLibreoffice.com_.sun.star.i18n.CalendarItem2
import typings.activexLibreoffice.com_.sun.star.i18n.Currency2
import typings.activexLibreoffice.com_.sun.star.i18n.ForbiddenCharacters
import typings.activexLibreoffice.com_.sun.star.i18n.FormatElement
import typings.activexLibreoffice.com_.sun.star.i18n.Implementation
import typings.activexLibreoffice.com_.sun.star.i18n.LanguageCountryInfo
import typings.activexLibreoffice.com_.sun.star.i18n.LineBreakHyphenationOptions
import typings.activexLibreoffice.com_.sun.star.i18n.LineBreakResults
import typings.activexLibreoffice.com_.sun.star.i18n.LineBreakUserOptions
import typings.activexLibreoffice.com_.sun.star.i18n.LocaleDataItem
import typings.activexLibreoffice.com_.sun.star.i18n.NativeNumberXmlAttributes
import typings.activexLibreoffice.com_.sun.star.i18n.NumberFormatCode
import typings.activexLibreoffice.com_.sun.star.i18n.ParseResult
import typings.activexLibreoffice.com_.sun.star.i18n.TextConversionResult
import typings.activexLibreoffice.com_.sun.star.inspection.LineDescriptor
import typings.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typings.activexLibreoffice.com_.sun.star.io.DataTransferEvent
import typings.activexLibreoffice.com_.sun.star.io.FilePermission
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryEvent
import typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryListEvent
import typings.activexLibreoffice.com_.sun.star.linguistic2.LinguServiceEvent
import typings.activexLibreoffice.com_.sun.star.linguistic2.ProofreadingResult
import typings.activexLibreoffice.com_.sun.star.linguistic2.SingleProofreadingError
import typings.activexLibreoffice.com_.sun.star.logging.LogRecord
import typings.activexLibreoffice.com_.sun.star.mail.MailAttachment
import typings.activexLibreoffice.com_.sun.star.mozilla.MenuMultipleChange
import typings.activexLibreoffice.com_.sun.star.mozilla.MenuSingleChange
import typings.activexLibreoffice.com_.sun.star.packages.zip.ZipEntry
import typings.activexLibreoffice.com_.sun.star.presentation.ParagraphTarget
import typings.activexLibreoffice.com_.sun.star.rdf.Statement
import typings.activexLibreoffice.com_.sun.star.reflection.ParamInfo
import typings.activexLibreoffice.com_.sun.star.rendering.ARGBColor
import typings.activexLibreoffice.com_.sun.star.rendering.AnimationAttributes
import typings.activexLibreoffice.com_.sun.star.rendering.Caret
import typings.activexLibreoffice.com_.sun.star.rendering.ColorProfile
import typings.activexLibreoffice.com_.sun.star.rendering.FloatingPointBitmapLayout
import typings.activexLibreoffice.com_.sun.star.rendering.FontInfo
import typings.activexLibreoffice.com_.sun.star.rendering.FontMetrics
import typings.activexLibreoffice.com_.sun.star.rendering.FontRequest
import typings.activexLibreoffice.com_.sun.star.rendering.IntegerBitmapLayout
import typings.activexLibreoffice.com_.sun.star.rendering.Panose
import typings.activexLibreoffice.com_.sun.star.rendering.RGBColor
import typings.activexLibreoffice.com_.sun.star.rendering.RenderState
import typings.activexLibreoffice.com_.sun.star.rendering.StringContext
import typings.activexLibreoffice.com_.sun.star.rendering.StrokeAttributes
import typings.activexLibreoffice.com_.sun.star.rendering.TextHit
import typings.activexLibreoffice.com_.sun.star.rendering.Texture
import typings.activexLibreoffice.com_.sun.star.rendering.ViewState
import typings.activexLibreoffice.com_.sun.star.scanner.ScannerContext
import typings.activexLibreoffice.com_.sun.star.script.AllEventObject
import typings.activexLibreoffice.com_.sun.star.script.ArrayWrapper
import typings.activexLibreoffice.com_.sun.star.script.ContextInformation
import typings.activexLibreoffice.com_.sun.star.script.EventListener
import typings.activexLibreoffice.com_.sun.star.script.FinishEngineEvent
import typings.activexLibreoffice.com_.sun.star.script.InterruptEngineEvent
import typings.activexLibreoffice.com_.sun.star.script.InvocationInfo
import typings.activexLibreoffice.com_.sun.star.script.ModuleInfo
import typings.activexLibreoffice.com_.sun.star.script.NativeObjectWrapper
import typings.activexLibreoffice.com_.sun.star.script.ScriptEvent
import typings.activexLibreoffice.com_.sun.star.script.ScriptEventDescriptor
import typings.activexLibreoffice.com_.sun.star.script.vba.VBAScriptEvent
import typings.activexLibreoffice.com_.sun.star.sdb.DatabaseRegistrationEvent
import typings.activexLibreoffice.com_.sun.star.sdb.RowChangeEvent
import typings.activexLibreoffice.com_.sun.star.sdb.RowsChangeEvent
import typings.activexLibreoffice.com_.sun.star.sdb.SQLErrorEvent
import typings.activexLibreoffice.com_.sun.star.sdb.application.CopyTableRowEvent
import typings.activexLibreoffice.com_.sun.star.sdb.application.NamedDatabaseObject
import typings.activexLibreoffice.com_.sun.star.sdbc.ChangeEvent
import typings.activexLibreoffice.com_.sun.star.sdbc.DriverPropertyInfo
import typings.activexLibreoffice.com_.sun.star.security.AllPermission
import typings.activexLibreoffice.com_.sun.star.security.CertAltNameEntry
import typings.activexLibreoffice.com_.sun.star.security.DocumentSignatureInformation
import typings.activexLibreoffice.com_.sun.star.security.RuntimePermission
import typings.activexLibreoffice.com_.sun.star.sheet.ActivationEvent
import typings.activexLibreoffice.com_.sun.star.sheet.ComplexReference
import typings.activexLibreoffice.com_.sun.star.sheet.DDEItemInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DDELinkInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldAutoShowInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldFilter
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroupInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldLayoutInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldReference
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldSortInfo
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotTableHeaderData
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotTablePositionData
import typings.activexLibreoffice.com_.sun.star.sheet.DataPilotTableResultData
import typings.activexLibreoffice.com_.sun.star.sheet.DataResult
import typings.activexLibreoffice.com_.sun.star.sheet.ExternalLinkInfo
import typings.activexLibreoffice.com_.sun.star.sheet.ExternalReference
import typings.activexLibreoffice.com_.sun.star.sheet.FilterFieldValue
import typings.activexLibreoffice.com_.sun.star.sheet.FormulaOpCodeMapEntry
import typings.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typings.activexLibreoffice.com_.sun.star.sheet.FunctionArgument
import typings.activexLibreoffice.com_.sun.star.sheet.GoalResult
import typings.activexLibreoffice.com_.sun.star.sheet.LocalizedName
import typings.activexLibreoffice.com_.sun.star.sheet.MemberResult
import typings.activexLibreoffice.com_.sun.star.sheet.NameToken
import typings.activexLibreoffice.com_.sun.star.sheet.RangeSelectionEvent
import typings.activexLibreoffice.com_.sun.star.sheet.ResultEvent
import typings.activexLibreoffice.com_.sun.star.sheet.SingleReference
import typings.activexLibreoffice.com_.sun.star.sheet.SolverConstraint
import typings.activexLibreoffice.com_.sun.star.sheet.SubTotalColumn
import typings.activexLibreoffice.com_.sun.star.sheet.TableFilterField
import typings.activexLibreoffice.com_.sun.star.sheet.TableFilterField2
import typings.activexLibreoffice.com_.sun.star.sheet.TableFilterField3
import typings.activexLibreoffice.com_.sun.star.sheet.TablePageBreakData
import typings.activexLibreoffice.com_.sun.star.sheet.opencl.OpenCLDevice
import typings.activexLibreoffice.com_.sun.star.sheet.opencl.OpenCLPlatform
import typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typings.activexLibreoffice.com_.sun.star.style.LineSpacing
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.table.TableBorder
import typings.activexLibreoffice.com_.sun.star.table.TableBorder2
import typings.activexLibreoffice.com_.sun.star.table.TableBorderDistances
import typings.activexLibreoffice.com_.sun.star.table.TableSortField
import typings.activexLibreoffice.com_.sun.star.task.UrlRecord
import typings.activexLibreoffice.com_.sun.star.task.UserRecord
import typings.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typings.activexLibreoffice.com_.sun.star.text.HoriOrientationFormat
import typings.activexLibreoffice.com_.sun.star.text.MailMergeEvent
import typings.activexLibreoffice.com_.sun.star.text.SectionFileLink
import typings.activexLibreoffice.com_.sun.star.text.TableColumnSeparator
import typings.activexLibreoffice.com_.sun.star.text.TextColumn
import typings.activexLibreoffice.com_.sun.star.text.TextMarkupDescriptor
import typings.activexLibreoffice.com_.sun.star.text.TextPosition
import typings.activexLibreoffice.com_.sun.star.text.TextRangeSelection
import typings.activexLibreoffice.com_.sun.star.text.VertOrientationFormat
import typings.activexLibreoffice.com_.sun.star.ucb.CheckinArgument
import typings.activexLibreoffice.com_.sun.star.ucb.Command
import typings.activexLibreoffice.com_.sun.star.ucb.CommandInfo
import typings.activexLibreoffice.com_.sun.star.ucb.CommandInfoChangeEvent
import typings.activexLibreoffice.com_.sun.star.ucb.ContentEvent
import typings.activexLibreoffice.com_.sun.star.ucb.ContentInfo
import typings.activexLibreoffice.com_.sun.star.ucb.ContentProviderInfo
import typings.activexLibreoffice.com_.sun.star.ucb.CrossReference
import typings.activexLibreoffice.com_.sun.star.ucb.DocumentHeaderField
import typings.activexLibreoffice.com_.sun.star.ucb.ExportStreamInfo
import typings.activexLibreoffice.com_.sun.star.ucb.FetchResult
import typings.activexLibreoffice.com_.sun.star.ucb.FolderList
import typings.activexLibreoffice.com_.sun.star.ucb.FolderListEntry
import typings.activexLibreoffice.com_.sun.star.ucb.GlobalTransferCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.GlobalTransferCommandArgument2
import typings.activexLibreoffice.com_.sun.star.ucb.InsertCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.InsertCommandArgument2
import typings.activexLibreoffice.com_.sun.star.ucb.Link
import typings.activexLibreoffice.com_.sun.star.ucb.ListAction
import typings.activexLibreoffice.com_.sun.star.ucb.ListEvent
import typings.activexLibreoffice.com_.sun.star.ucb.Lock
import typings.activexLibreoffice.com_.sun.star.ucb.LockEntry
import typings.activexLibreoffice.com_.sun.star.ucb.NumberedSortingInfo
import typings.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument2
import typings.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument3
import typings.activexLibreoffice.com_.sun.star.ucb.PostCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.PostCommandArgument2
import typings.activexLibreoffice.com_.sun.star.ucb.PropertyCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.PropertyValueInfo
import typings.activexLibreoffice.com_.sun.star.ucb.RecipientInfo
import typings.activexLibreoffice.com_.sun.star.ucb.RemoteContentProviderChangeEvent
import typings.activexLibreoffice.com_.sun.star.ucb.Rule
import typings.activexLibreoffice.com_.sun.star.ucb.RuleSet
import typings.activexLibreoffice.com_.sun.star.ucb.RuleTerm
import typings.activexLibreoffice.com_.sun.star.ucb.SearchCommandArgument
import typings.activexLibreoffice.com_.sun.star.ucb.SearchCriterium
import typings.activexLibreoffice.com_.sun.star.ucb.SearchInfo
import typings.activexLibreoffice.com_.sun.star.ucb.SendInfo
import typings.activexLibreoffice.com_.sun.star.ucb.SendMediaTypes
import typings.activexLibreoffice.com_.sun.star.ucb.SortingInfo
import typings.activexLibreoffice.com_.sun.star.ucb.TransferInfo
import typings.activexLibreoffice.com_.sun.star.ucb.TransferInfo2
import typings.activexLibreoffice.com_.sun.star.ucb.TransferResult
import typings.activexLibreoffice.com_.sun.star.ucb.WelcomeDynamicResultSetStruct
import typings.activexLibreoffice.com_.sun.star.ui.ConfigurationEvent
import typings.activexLibreoffice.com_.sun.star.ui.ContextChangeEventObject
import typings.activexLibreoffice.com_.sun.star.ui.ContextMenuExecuteEvent
import typings.activexLibreoffice.com_.sun.star.ui.LayoutSize
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.DialogClosedEvent
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.FilePickerEvent
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.util.AliasProgrammaticPair
import typings.activexLibreoffice.com_.sun.star.util.AtomClassRequest
import typings.activexLibreoffice.com_.sun.star.util.AtomDescription
import typings.activexLibreoffice.com_.sun.star.util.CellProtection
import typings.activexLibreoffice.com_.sun.star.util.ChangesEvent
import typings.activexLibreoffice.com_.sun.star.util.DataEditorEvent
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.DateTimeRange
import typings.activexLibreoffice.com_.sun.star.util.DateTimeWithTimezone
import typings.activexLibreoffice.com_.sun.star.util.DateWithTimezone
import typings.activexLibreoffice.com_.sun.star.util.Duration
import typings.activexLibreoffice.com_.sun.star.util.ElementChange
import typings.activexLibreoffice.com_.sun.star.util.ModeChangeEvent
import typings.activexLibreoffice.com_.sun.star.util.RevisionTag
import typings.activexLibreoffice.com_.sun.star.util.SearchOptions
import typings.activexLibreoffice.com_.sun.star.util.SearchOptions2
import typings.activexLibreoffice.com_.sun.star.util.SearchResult
import typings.activexLibreoffice.com_.sun.star.util.SortField
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.util.TimeWithTimezone
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.view.PrintJobEvent
import typings.activexLibreoffice.com_.sun.star.view.PrintableStateEvent
import typings.activexLibreoffice.com_.sun.star.xml.Attribute
import typings.activexLibreoffice.com_.sun.star.xml.AttributeData
import typings.activexLibreoffice.com_.sun.star.xml.FastAttribute
import typings.activexLibreoffice.com_.sun.star.xml.crypto.sax.ElementStackItem
import typings.activexLibreoffice.com_.sun.star.xml.csax.XMLAttribute
import typings.activexLibreoffice.com_.sun.star.xml.sax.InputSource
import typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructNameMap extends js.Object {
  @JSName("com.sun.star.accessibility.AccessibleEventObject")
  var comDotsunDotstarDotaccessibilityDotAccessibleEventObject: AccessibleEventObject
  @JSName("com.sun.star.accessibility.AccessibleRelation")
  var comDotsunDotstarDotaccessibilityDotAccessibleRelation: AccessibleRelation
  @JSName("com.sun.star.accessibility.AccessibleTableModelChange")
  var comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange: AccessibleTableModelChange
  @JSName("com.sun.star.accessibility.TextSegment")
  var comDotsunDotstarDotaccessibilityDotTextSegment: TextSegment
  @JSName("com.sun.star.animations.Event")
  var comDotsunDotstarDotanimationsDotEvent: Event
  @JSName("com.sun.star.animations.TargetProperties")
  var comDotsunDotstarDotanimationsDotTargetProperties: TargetProperties
  @JSName("com.sun.star.animations.TimeFilterPair")
  var comDotsunDotstarDotanimationsDotTimeFilterPair: TimeFilterPair
  @JSName("com.sun.star.animations.ValuePair")
  var comDotsunDotstarDotanimationsDotValuePair: ValuePair
  @JSName("com.sun.star.awt.ActionEvent")
  var comDotsunDotstarDotawtDotActionEvent: ActionEvent
  @JSName("com.sun.star.awt.AdjustmentEvent")
  var comDotsunDotstarDotawtDotAdjustmentEvent: AdjustmentEvent
  @JSName("com.sun.star.awt.DeviceInfo")
  var comDotsunDotstarDotawtDotDeviceInfo: DeviceInfo
  @JSName("com.sun.star.awt.DockingData")
  var comDotsunDotstarDotawtDotDockingData: DockingData
  @JSName("com.sun.star.awt.DockingEvent")
  var comDotsunDotstarDotawtDotDockingEvent: DockingEvent
  @JSName("com.sun.star.awt.EndDockingEvent")
  var comDotsunDotstarDotawtDotEndDockingEvent: EndDockingEvent
  @JSName("com.sun.star.awt.EndPopupModeEvent")
  var comDotsunDotstarDotawtDotEndPopupModeEvent: EndPopupModeEvent
  @JSName("com.sun.star.awt.EnhancedMouseEvent")
  var comDotsunDotstarDotawtDotEnhancedMouseEvent: EnhancedMouseEvent
  @JSName("com.sun.star.awt.FocusEvent")
  var comDotsunDotstarDotawtDotFocusEvent: FocusEvent
  @JSName("com.sun.star.awt.FontDescriptor")
  var comDotsunDotstarDotawtDotFontDescriptor: FontDescriptor
  @JSName("com.sun.star.awt.Gradient")
  var comDotsunDotstarDotawtDotGradient: Gradient
  @JSName("com.sun.star.awt.InputEvent")
  var comDotsunDotstarDotawtDotInputEvent: InputEvent
  @JSName("com.sun.star.awt.ItemEvent")
  var comDotsunDotstarDotawtDotItemEvent: ItemEvent
  @JSName("com.sun.star.awt.ItemListEvent")
  var comDotsunDotstarDotawtDotItemListEvent: ItemListEvent
  @JSName("com.sun.star.awt.KeyEvent")
  var comDotsunDotstarDotawtDotKeyEvent: KeyEvent
  @JSName("com.sun.star.awt.KeyStroke")
  var comDotsunDotstarDotawtDotKeyStroke: KeyStroke
  @JSName("com.sun.star.awt.MenuEvent")
  var comDotsunDotstarDotawtDotMenuEvent: MenuEvent
  @JSName("com.sun.star.awt.MouseEvent")
  var comDotsunDotstarDotawtDotMouseEvent: MouseEvent
  @JSName("com.sun.star.awt.PaintEvent")
  var comDotsunDotstarDotawtDotPaintEvent: PaintEvent
  @JSName("com.sun.star.awt.Point")
  var comDotsunDotstarDotawtDotPoint: Point
  @JSName("com.sun.star.awt.Rectangle")
  var comDotsunDotstarDotawtDotRectangle: Rectangle
  @JSName("com.sun.star.awt.Selection")
  var comDotsunDotstarDotawtDotSelection: Selection
  @JSName("com.sun.star.awt.SimpleFontMetric")
  var comDotsunDotstarDotawtDotSimpleFontMetric: SimpleFontMetric
  @JSName("com.sun.star.awt.Size")
  var comDotsunDotstarDotawtDotSize: Size
  @JSName("com.sun.star.awt.SpinEvent")
  var comDotsunDotstarDotawtDotSpinEvent: SpinEvent
  @JSName("com.sun.star.awt.SystemDependentXWindow")
  var comDotsunDotstarDotawtDotSystemDependentXWindow: SystemDependentXWindow
  @JSName("com.sun.star.awt.TextEvent")
  var comDotsunDotstarDotawtDotTextEvent: TextEvent
  @JSName("com.sun.star.awt.VclContainerEvent")
  var comDotsunDotstarDotawtDotVclContainerEvent: VclContainerEvent
  @JSName("com.sun.star.awt.WindowDescriptor")
  var comDotsunDotstarDotawtDotWindowDescriptor: WindowDescriptor
  @JSName("com.sun.star.awt.WindowEvent")
  var comDotsunDotstarDotawtDotWindowEvent: WindowEvent
  @JSName("com.sun.star.awt.grid.GridColumnEvent")
  var comDotsunDotstarDotawtDotgridDotGridColumnEvent: GridColumnEvent
  @JSName("com.sun.star.awt.grid.GridDataEvent")
  var comDotsunDotstarDotawtDotgridDotGridDataEvent: GridDataEvent
  @JSName("com.sun.star.awt.grid.GridSelectionEvent")
  var comDotsunDotstarDotawtDotgridDotGridSelectionEvent: GridSelectionEvent
  @JSName("com.sun.star.awt.tab.TabPageActivatedEvent")
  var comDotsunDotstarDotawtDottabDotTabPageActivatedEvent: TabPageActivatedEvent
  @JSName("com.sun.star.awt.tree.TreeDataModelEvent")
  var comDotsunDotstarDotawtDottreeDotTreeDataModelEvent: TreeDataModelEvent
  @JSName("com.sun.star.awt.tree.TreeExpansionEvent")
  var comDotsunDotstarDotawtDottreeDotTreeExpansionEvent: TreeExpansionEvent
  @JSName("com.sun.star.beans.GetDirectPropertyTolerantResult")
  var comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult: GetDirectPropertyTolerantResult
  @JSName("com.sun.star.beans.GetPropertyTolerantResult")
  var comDotsunDotstarDotbeansDotGetPropertyTolerantResult: GetPropertyTolerantResult
  @JSName("com.sun.star.beans.NamedValue")
  var comDotsunDotstarDotbeansDotNamedValue: NamedValue
  @JSName("com.sun.star.beans.Property")
  var comDotsunDotstarDotbeansDotProperty: Property
  @JSName("com.sun.star.beans.PropertyChangeEvent")
  var comDotsunDotstarDotbeansDotPropertyChangeEvent: PropertyChangeEvent
  @JSName("com.sun.star.beans.PropertySetInfoChangeEvent")
  var comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent: PropertySetInfoChangeEvent
  @JSName("com.sun.star.beans.PropertyStateChangeEvent")
  var comDotsunDotstarDotbeansDotPropertyStateChangeEvent: PropertyStateChangeEvent
  @JSName("com.sun.star.beans.PropertyValue")
  var comDotsunDotstarDotbeansDotPropertyValue: PropertyValue
  @JSName("com.sun.star.beans.SetPropertyTolerantFailed")
  var comDotsunDotstarDotbeansDotSetPropertyTolerantFailed: SetPropertyTolerantFailed
  @JSName("com.sun.star.beans.StringPair")
  var comDotsunDotstarDotbeansDotStringPair: StringPair
  @JSName("com.sun.star.bridge.ProtocolProperty")
  var comDotsunDotstarDotbridgeDotProtocolProperty: ProtocolProperty
  @JSName("com.sun.star.bridge.oleautomation.Currency")
  var comDotsunDotstarDotbridgeDotoleautomationDotCurrency: Currency
  @JSName("com.sun.star.bridge.oleautomation.Date")
  var comDotsunDotstarDotbridgeDotoleautomationDotDate: Date
  @JSName("com.sun.star.bridge.oleautomation.Decimal")
  var comDotsunDotstarDotbridgeDotoleautomationDotDecimal: Decimal
  @JSName("com.sun.star.bridge.oleautomation.NamedArgument")
  var comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument: NamedArgument
  @JSName("com.sun.star.bridge.oleautomation.PropertyPutArgument")
  var comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument: PropertyPutArgument
  @JSName("com.sun.star.bridge.oleautomation.SCode")
  var comDotsunDotstarDotbridgeDotoleautomationDotSCode: SCode
  @JSName("com.sun.star.chart2.DataPointLabel")
  var comDotsunDotstarDotchart2DotDataPointLabel: DataPointLabel
  @JSName("com.sun.star.chart2.FillBitmap")
  var comDotsunDotstarDotchart2DotFillBitmap: FillBitmap
  @JSName("com.sun.star.chart2.IncrementData")
  var comDotsunDotstarDotchart2DotIncrementData: IncrementData
  @JSName("com.sun.star.chart2.InterpretedData")
  var comDotsunDotstarDotchart2DotInterpretedData: InterpretedData
  @JSName("com.sun.star.chart2.LightSource")
  var comDotsunDotstarDotchart2DotLightSource: LightSource
  @JSName("com.sun.star.chart2.RelativePosition")
  var comDotsunDotstarDotchart2DotRelativePosition: RelativePosition
  @JSName("com.sun.star.chart2.RelativeSize")
  var comDotsunDotstarDotchart2DotRelativeSize: RelativeSize
  @JSName("com.sun.star.chart2.ScaleData")
  var comDotsunDotstarDotchart2DotScaleData: ScaleData
  @JSName("com.sun.star.chart2.SubIncrement")
  var comDotsunDotstarDotchart2DotSubIncrement: SubIncrement
  @JSName("com.sun.star.chart2.Symbol")
  var comDotsunDotstarDotchart2DotSymbol: Symbol
  @JSName("com.sun.star.chart2.data.HighlightedRange")
  var comDotsunDotstarDotchart2DotdataDotHighlightedRange: HighlightedRange
  @JSName("com.sun.star.chart.ChartDataChangeEvent")
  var comDotsunDotstarDotchartDotChartDataChangeEvent: ChartDataChangeEvent
  @JSName("com.sun.star.chart.ChartDataRow")
  var comDotsunDotstarDotchartDotChartDataRow: ChartDataRow
  @JSName("com.sun.star.chart.ChartDataValue")
  var comDotsunDotstarDotchartDotChartDataValue: ChartDataValue
  @JSName("com.sun.star.chart.ChartSeriesAddress")
  var comDotsunDotstarDotchartDotChartSeriesAddress: ChartSeriesAddress
  @JSName("com.sun.star.chart.TimeIncrement")
  var comDotsunDotstarDotchartDotTimeIncrement: TimeIncrement
  @JSName("com.sun.star.chart.TimeInterval")
  var comDotsunDotstarDotchartDotTimeInterval: TimeInterval
  @JSName("com.sun.star.configuration.backend.ComponentChangeEvent")
  var comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent: ComponentChangeEvent
  @JSName("com.sun.star.configuration.backend.PropertyInfo")
  var comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo: PropertyInfo
  @JSName("com.sun.star.configuration.backend.TemplateIdentifier")
  var comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier: TemplateIdentifier
  @JSName("com.sun.star.connection.SocketPermission")
  var comDotsunDotstarDotconnectionDotSocketPermission: SocketPermission
  @JSName("com.sun.star.container.ContainerEvent")
  var comDotsunDotstarDotcontainerDotContainerEvent: ContainerEvent
  @JSName("com.sun.star.datatransfer.DataFlavor")
  var comDotsunDotstarDotdatatransferDotDataFlavor: DataFlavor
  @JSName("com.sun.star.datatransfer.clipboard.ClipboardEvent")
  var comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent: ClipboardEvent
  @JSName("com.sun.star.datatransfer.dnd.DragGestureEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent: DragGestureEvent
  @JSName("com.sun.star.datatransfer.dnd.DragSourceDragEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent: DragSourceDragEvent
  @JSName("com.sun.star.datatransfer.dnd.DragSourceDropEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent: DragSourceDropEvent
  @JSName("com.sun.star.datatransfer.dnd.DragSourceEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent: DragSourceEvent
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDragEnterEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent: DropTargetDragEnterEvent
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDragEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent: DropTargetDragEvent
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDropEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent: DropTargetDropEvent
  @JSName("com.sun.star.datatransfer.dnd.DropTargetEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent: DropTargetEvent
  @JSName("com.sun.star.deployment.UpdateInformationEntry")
  var comDotsunDotstarDotdeploymentDotUpdateInformationEntry: UpdateInformationEntry
  @JSName("com.sun.star.document.CmisProperty")
  var comDotsunDotstarDotdocumentDotCmisProperty: CmisProperty
  @JSName("com.sun.star.document.CmisVersion")
  var comDotsunDotstarDotdocumentDotCmisVersion: CmisVersion
  @JSName("com.sun.star.document.DocumentEvent")
  var comDotsunDotstarDotdocumentDotDocumentEvent: DocumentEvent
  @JSName("com.sun.star.document.EventObject")
  var comDotsunDotstarDotdocumentDotEventObject: EventObject
  @JSName("com.sun.star.document.UndoManagerEvent")
  var comDotsunDotstarDotdocumentDotUndoManagerEvent: UndoManagerEvent
  @JSName("com.sun.star.drawing.BezierPoint")
  var comDotsunDotstarDotdrawingDotBezierPoint: BezierPoint
  @JSName("com.sun.star.drawing.BoundVolume")
  var comDotsunDotstarDotdrawingDotBoundVolume: BoundVolume
  @JSName("com.sun.star.drawing.CameraGeometry")
  var comDotsunDotstarDotdrawingDotCameraGeometry: CameraGeometry
  @JSName("com.sun.star.drawing.Direction3D")
  var comDotsunDotstarDotdrawingDotDirection3D: Direction3D
  @JSName("com.sun.star.drawing.EnhancedCustomShapeAdjustmentValue")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue: EnhancedCustomShapeAdjustmentValue
  @JSName("com.sun.star.drawing.EnhancedCustomShapeParameter")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter: EnhancedCustomShapeParameter
  @JSName("com.sun.star.drawing.EnhancedCustomShapeParameterPair")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair: EnhancedCustomShapeParameterPair
  @JSName("com.sun.star.drawing.EnhancedCustomShapeSegment")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment: EnhancedCustomShapeSegment
  @JSName("com.sun.star.drawing.EnhancedCustomShapeTextFrame")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame: EnhancedCustomShapeTextFrame
  @JSName("com.sun.star.drawing.GluePoint")
  var comDotsunDotstarDotdrawingDotGluePoint: GluePoint
  @JSName("com.sun.star.drawing.GluePoint2")
  var comDotsunDotstarDotdrawingDotGluePoint2: GluePoint2
  @JSName("com.sun.star.drawing.Hatch")
  var comDotsunDotstarDotdrawingDotHatch: Hatch
  @JSName("com.sun.star.drawing.HomogenMatrix")
  var comDotsunDotstarDotdrawingDotHomogenMatrix: HomogenMatrix
  @JSName("com.sun.star.drawing.HomogenMatrix3")
  var comDotsunDotstarDotdrawingDotHomogenMatrix3: HomogenMatrix3
  @JSName("com.sun.star.drawing.HomogenMatrix4")
  var comDotsunDotstarDotdrawingDotHomogenMatrix4: HomogenMatrix4
  @JSName("com.sun.star.drawing.HomogenMatrixLine")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine: HomogenMatrixLine
  @JSName("com.sun.star.drawing.HomogenMatrixLine3")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine3: HomogenMatrixLine3
  @JSName("com.sun.star.drawing.HomogenMatrixLine4")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine4: HomogenMatrixLine4
  @JSName("com.sun.star.drawing.LineDash")
  var comDotsunDotstarDotdrawingDotLineDash: LineDash
  @JSName("com.sun.star.drawing.PolyPolygonBezierCoords")
  var comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords: PolyPolygonBezierCoords
  @JSName("com.sun.star.drawing.PolyPolygonShape3D")
  var comDotsunDotstarDotdrawingDotPolyPolygonShape3D: PolyPolygonShape3D
  @JSName("com.sun.star.drawing.Position3D")
  var comDotsunDotstarDotdrawingDotPosition3D: Position3D
  @JSName("com.sun.star.drawing.framework.ConfigurationChangeEvent")
  var comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent: ConfigurationChangeEvent
  @JSName("com.sun.star.drawing.framework.TabBarButton")
  var comDotsunDotstarDotdrawingDotframeworkDotTabBarButton: TabBarButton
  @JSName("com.sun.star.embed.InsertedObjectInfo")
  var comDotsunDotstarDotembedDotInsertedObjectInfo: InsertedObjectInfo
  @JSName("com.sun.star.embed.VerbDescriptor")
  var comDotsunDotstarDotembedDotVerbDescriptor: VerbDescriptor
  @JSName("com.sun.star.embed.VisualRepresentation")
  var comDotsunDotstarDotembedDotVisualRepresentation: VisualRepresentation
  @JSName("com.sun.star.form.DatabaseDeleteEvent")
  var comDotsunDotstarDotformDotDatabaseDeleteEvent: DatabaseDeleteEvent
  @JSName("com.sun.star.form.DatabaseParameterEvent")
  var comDotsunDotstarDotformDotDatabaseParameterEvent: DatabaseParameterEvent
  @JSName("com.sun.star.form.ErrorEvent")
  var comDotsunDotstarDotformDotErrorEvent: ErrorEvent
  @JSName("com.sun.star.form.binding.ListEntryEvent")
  var comDotsunDotstarDotformDotbindingDotListEntryEvent: ListEntryEvent
  @JSName("com.sun.star.form.runtime.FeatureState")
  var comDotsunDotstarDotformDotruntimeDotFeatureState: FeatureState
  @JSName("com.sun.star.form.runtime.FilterEvent")
  var comDotsunDotstarDotformDotruntimeDotFilterEvent: FilterEvent
  @JSName("com.sun.star.formula.SymbolDescriptor")
  var comDotsunDotstarDotformulaDotSymbolDescriptor: SymbolDescriptor
  @JSName("com.sun.star.frame.BorderWidths")
  var comDotsunDotstarDotframeDotBorderWidths: BorderWidths
  @JSName("com.sun.star.frame.ControlCommand")
  var comDotsunDotstarDotframeDotControlCommand: ControlCommand
  @JSName("com.sun.star.frame.ControlEvent")
  var comDotsunDotstarDotframeDotControlEvent: ControlEvent
  @JSName("com.sun.star.frame.DispatchDescriptor")
  var comDotsunDotstarDotframeDotDispatchDescriptor: DispatchDescriptor
  @JSName("com.sun.star.frame.DispatchInformation")
  var comDotsunDotstarDotframeDotDispatchInformation: DispatchInformation
  @JSName("com.sun.star.frame.DispatchResultEvent")
  var comDotsunDotstarDotframeDotDispatchResultEvent: DispatchResultEvent
  @JSName("com.sun.star.frame.DispatchStatement")
  var comDotsunDotstarDotframeDotDispatchStatement: DispatchStatement
  @JSName("com.sun.star.frame.FeatureStateEvent")
  var comDotsunDotstarDotframeDotFeatureStateEvent: FeatureStateEvent
  @JSName("com.sun.star.frame.FrameActionEvent")
  var comDotsunDotstarDotframeDotFrameActionEvent: FrameActionEvent
  @JSName("com.sun.star.frame.TitleChangedEvent")
  var comDotsunDotstarDotframeDotTitleChangedEvent: TitleChangedEvent
  @JSName("com.sun.star.frame.status.ClipboardFormats")
  var comDotsunDotstarDotframeDotstatusDotClipboardFormats: ClipboardFormats
  @JSName("com.sun.star.frame.status.FontHeight")
  var comDotsunDotstarDotframeDotstatusDotFontHeight: FontHeight
  @JSName("com.sun.star.frame.status.ItemStatus")
  var comDotsunDotstarDotframeDotstatusDotItemStatus: ItemStatus
  @JSName("com.sun.star.frame.status.LeftRightMargin")
  var comDotsunDotstarDotframeDotstatusDotLeftRightMargin: LeftRightMargin
  @JSName("com.sun.star.frame.status.LeftRightMarginScale")
  var comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale: LeftRightMarginScale
  @JSName("com.sun.star.frame.status.Template")
  var comDotsunDotstarDotframeDotstatusDotTemplate: Template
  @JSName("com.sun.star.frame.status.UpperLowerMargin")
  var comDotsunDotstarDotframeDotstatusDotUpperLowerMargin: UpperLowerMargin
  @JSName("com.sun.star.frame.status.UpperLowerMarginScale")
  var comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale: UpperLowerMarginScale
  @JSName("com.sun.star.frame.status.Verb")
  var comDotsunDotstarDotframeDotstatusDotVerb: Verb
  @JSName("com.sun.star.frame.status.Visibility")
  var comDotsunDotstarDotframeDotstatusDotVisibility: Visibility
  @JSName("com.sun.star.geometry.AffineMatrix2D")
  var comDotsunDotstarDotgeometryDotAffineMatrix2D: AffineMatrix2D
  @JSName("com.sun.star.geometry.AffineMatrix3D")
  var comDotsunDotstarDotgeometryDotAffineMatrix3D: AffineMatrix3D
  @JSName("com.sun.star.geometry.EllipticalArc")
  var comDotsunDotstarDotgeometryDotEllipticalArc: EllipticalArc
  @JSName("com.sun.star.geometry.IntegerBezierSegment2D")
  var comDotsunDotstarDotgeometryDotIntegerBezierSegment2D: IntegerBezierSegment2D
  @JSName("com.sun.star.geometry.IntegerPoint2D")
  var comDotsunDotstarDotgeometryDotIntegerPoint2D: IntegerPoint2D
  @JSName("com.sun.star.geometry.IntegerRectangle2D")
  var comDotsunDotstarDotgeometryDotIntegerRectangle2D: IntegerRectangle2D
  @JSName("com.sun.star.geometry.IntegerSize2D")
  var comDotsunDotstarDotgeometryDotIntegerSize2D: IntegerSize2D
  @JSName("com.sun.star.geometry.Matrix2D")
  var comDotsunDotstarDotgeometryDotMatrix2D: Matrix2D
  @JSName("com.sun.star.geometry.RealBezierSegment2D")
  var comDotsunDotstarDotgeometryDotRealBezierSegment2D: RealBezierSegment2D
  @JSName("com.sun.star.geometry.RealPoint2D")
  var comDotsunDotstarDotgeometryDotRealPoint2D: RealPoint2D
  @JSName("com.sun.star.geometry.RealRectangle2D")
  var comDotsunDotstarDotgeometryDotRealRectangle2D: RealRectangle2D
  @JSName("com.sun.star.geometry.RealRectangle3D")
  var comDotsunDotstarDotgeometryDotRealRectangle3D: RealRectangle3D
  @JSName("com.sun.star.geometry.RealSize2D")
  var comDotsunDotstarDotgeometryDotRealSize2D: RealSize2D
  @JSName("com.sun.star.i18n.Boundary")
  var comDotsunDotstarDoti18nDotBoundary: Boundary
  @JSName("com.sun.star.i18n.Calendar")
  var comDotsunDotstarDoti18nDotCalendar: Calendar
  @JSName("com.sun.star.i18n.Calendar2")
  var comDotsunDotstarDoti18nDotCalendar2: Calendar2
  @JSName("com.sun.star.i18n.CalendarItem")
  var comDotsunDotstarDoti18nDotCalendarItem: CalendarItem
  @JSName("com.sun.star.i18n.CalendarItem2")
  var comDotsunDotstarDoti18nDotCalendarItem2: CalendarItem2
  @JSName("com.sun.star.i18n.Currency")
  var comDotsunDotstarDoti18nDotCurrency: typings.activexLibreoffice.com_.sun.star.i18n.Currency
  @JSName("com.sun.star.i18n.Currency2")
  var comDotsunDotstarDoti18nDotCurrency2: Currency2
  @JSName("com.sun.star.i18n.ForbiddenCharacters")
  var comDotsunDotstarDoti18nDotForbiddenCharacters: ForbiddenCharacters
  @JSName("com.sun.star.i18n.FormatElement")
  var comDotsunDotstarDoti18nDotFormatElement: FormatElement
  @JSName("com.sun.star.i18n.Implementation")
  var comDotsunDotstarDoti18nDotImplementation: Implementation
  @JSName("com.sun.star.i18n.LanguageCountryInfo")
  var comDotsunDotstarDoti18nDotLanguageCountryInfo: LanguageCountryInfo
  @JSName("com.sun.star.i18n.LineBreakHyphenationOptions")
  var comDotsunDotstarDoti18nDotLineBreakHyphenationOptions: LineBreakHyphenationOptions
  @JSName("com.sun.star.i18n.LineBreakResults")
  var comDotsunDotstarDoti18nDotLineBreakResults: LineBreakResults
  @JSName("com.sun.star.i18n.LineBreakUserOptions")
  var comDotsunDotstarDoti18nDotLineBreakUserOptions: LineBreakUserOptions
  @JSName("com.sun.star.i18n.LocaleDataItem")
  var comDotsunDotstarDoti18nDotLocaleDataItem: LocaleDataItem
  @JSName("com.sun.star.i18n.NativeNumberXmlAttributes")
  var comDotsunDotstarDoti18nDotNativeNumberXmlAttributes: NativeNumberXmlAttributes
  @JSName("com.sun.star.i18n.NumberFormatCode")
  var comDotsunDotstarDoti18nDotNumberFormatCode: NumberFormatCode
  @JSName("com.sun.star.i18n.ParseResult")
  var comDotsunDotstarDoti18nDotParseResult: ParseResult
  @JSName("com.sun.star.i18n.TextConversionResult")
  var comDotsunDotstarDoti18nDotTextConversionResult: TextConversionResult
  @JSName("com.sun.star.inspection.LineDescriptor")
  var comDotsunDotstarDotinspectionDotLineDescriptor: LineDescriptor
  @JSName("com.sun.star.inspection.PropertyCategoryDescriptor")
  var comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor: PropertyCategoryDescriptor
  @JSName("com.sun.star.io.DataTransferEvent")
  var comDotsunDotstarDotioDotDataTransferEvent: DataTransferEvent
  @JSName("com.sun.star.io.FilePermission")
  var comDotsunDotstarDotioDotFilePermission: FilePermission
  @JSName("com.sun.star.lang.EventObject")
  var comDotsunDotstarDotlangDotEventObject: typings.activexLibreoffice.com_.sun.star.lang.EventObject
  @JSName("com.sun.star.lang.Locale")
  var comDotsunDotstarDotlangDotLocale: Locale
  @JSName("com.sun.star.linguistic2.DictionaryEvent")
  var comDotsunDotstarDotlinguistic2DotDictionaryEvent: DictionaryEvent
  @JSName("com.sun.star.linguistic2.DictionaryListEvent")
  var comDotsunDotstarDotlinguistic2DotDictionaryListEvent: DictionaryListEvent
  @JSName("com.sun.star.linguistic2.LinguServiceEvent")
  var comDotsunDotstarDotlinguistic2DotLinguServiceEvent: LinguServiceEvent
  @JSName("com.sun.star.linguistic2.ProofreadingResult")
  var comDotsunDotstarDotlinguistic2DotProofreadingResult: ProofreadingResult
  @JSName("com.sun.star.linguistic2.SingleProofreadingError")
  var comDotsunDotstarDotlinguistic2DotSingleProofreadingError: SingleProofreadingError
  @JSName("com.sun.star.logging.LogRecord")
  var comDotsunDotstarDotloggingDotLogRecord: LogRecord
  @JSName("com.sun.star.mail.MailAttachment")
  var comDotsunDotstarDotmailDotMailAttachment: MailAttachment
  @JSName("com.sun.star.mozilla.MenuMultipleChange")
  var comDotsunDotstarDotmozillaDotMenuMultipleChange: MenuMultipleChange
  @JSName("com.sun.star.mozilla.MenuSingleChange")
  var comDotsunDotstarDotmozillaDotMenuSingleChange: MenuSingleChange
  @JSName("com.sun.star.packages.zip.ZipEntry")
  var comDotsunDotstarDotpackagesDotzipDotZipEntry: ZipEntry
  @JSName("com.sun.star.presentation.ParagraphTarget")
  var comDotsunDotstarDotpresentationDotParagraphTarget: ParagraphTarget
  @JSName("com.sun.star.rdf.Statement")
  var comDotsunDotstarDotrdfDotStatement: Statement
  @JSName("com.sun.star.reflection.ParamInfo")
  var comDotsunDotstarDotreflectionDotParamInfo: ParamInfo
  @JSName("com.sun.star.rendering.ARGBColor")
  var comDotsunDotstarDotrenderingDotARGBColor: ARGBColor
  @JSName("com.sun.star.rendering.AnimationAttributes")
  var comDotsunDotstarDotrenderingDotAnimationAttributes: AnimationAttributes
  @JSName("com.sun.star.rendering.Caret")
  var comDotsunDotstarDotrenderingDotCaret: Caret
  @JSName("com.sun.star.rendering.ColorProfile")
  var comDotsunDotstarDotrenderingDotColorProfile: ColorProfile
  @JSName("com.sun.star.rendering.FloatingPointBitmapLayout")
  var comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout: FloatingPointBitmapLayout
  @JSName("com.sun.star.rendering.FontInfo")
  var comDotsunDotstarDotrenderingDotFontInfo: FontInfo
  @JSName("com.sun.star.rendering.FontMetrics")
  var comDotsunDotstarDotrenderingDotFontMetrics: FontMetrics
  @JSName("com.sun.star.rendering.FontRequest")
  var comDotsunDotstarDotrenderingDotFontRequest: FontRequest
  @JSName("com.sun.star.rendering.IntegerBitmapLayout")
  var comDotsunDotstarDotrenderingDotIntegerBitmapLayout: IntegerBitmapLayout
  @JSName("com.sun.star.rendering.Panose")
  var comDotsunDotstarDotrenderingDotPanose: Panose
  @JSName("com.sun.star.rendering.RGBColor")
  var comDotsunDotstarDotrenderingDotRGBColor: RGBColor
  @JSName("com.sun.star.rendering.RenderState")
  var comDotsunDotstarDotrenderingDotRenderState: RenderState
  @JSName("com.sun.star.rendering.StringContext")
  var comDotsunDotstarDotrenderingDotStringContext: StringContext
  @JSName("com.sun.star.rendering.StrokeAttributes")
  var comDotsunDotstarDotrenderingDotStrokeAttributes: StrokeAttributes
  @JSName("com.sun.star.rendering.TextHit")
  var comDotsunDotstarDotrenderingDotTextHit: TextHit
  @JSName("com.sun.star.rendering.Texture")
  var comDotsunDotstarDotrenderingDotTexture: Texture
  @JSName("com.sun.star.rendering.ViewState")
  var comDotsunDotstarDotrenderingDotViewState: ViewState
  @JSName("com.sun.star.scanner.ScannerContext")
  var comDotsunDotstarDotscannerDotScannerContext: ScannerContext
  @JSName("com.sun.star.script.AllEventObject")
  var comDotsunDotstarDotscriptDotAllEventObject: AllEventObject
  @JSName("com.sun.star.script.ArrayWrapper")
  var comDotsunDotstarDotscriptDotArrayWrapper: ArrayWrapper
  @JSName("com.sun.star.script.ContextInformation")
  var comDotsunDotstarDotscriptDotContextInformation: ContextInformation
  @JSName("com.sun.star.script.EventListener")
  var comDotsunDotstarDotscriptDotEventListener: EventListener
  @JSName("com.sun.star.script.FinishEngineEvent")
  var comDotsunDotstarDotscriptDotFinishEngineEvent: FinishEngineEvent
  @JSName("com.sun.star.script.InterruptEngineEvent")
  var comDotsunDotstarDotscriptDotInterruptEngineEvent: InterruptEngineEvent
  @JSName("com.sun.star.script.InvocationInfo")
  var comDotsunDotstarDotscriptDotInvocationInfo: InvocationInfo
  @JSName("com.sun.star.script.ModuleInfo")
  var comDotsunDotstarDotscriptDotModuleInfo: ModuleInfo
  @JSName("com.sun.star.script.NativeObjectWrapper")
  var comDotsunDotstarDotscriptDotNativeObjectWrapper: NativeObjectWrapper
  @JSName("com.sun.star.script.ScriptEvent")
  var comDotsunDotstarDotscriptDotScriptEvent: ScriptEvent
  @JSName("com.sun.star.script.ScriptEventDescriptor")
  var comDotsunDotstarDotscriptDotScriptEventDescriptor: ScriptEventDescriptor
  @JSName("com.sun.star.script.vba.VBAScriptEvent")
  var comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent: VBAScriptEvent
  @JSName("com.sun.star.sdb.DatabaseRegistrationEvent")
  var comDotsunDotstarDotsdbDotDatabaseRegistrationEvent: DatabaseRegistrationEvent
  @JSName("com.sun.star.sdb.RowChangeEvent")
  var comDotsunDotstarDotsdbDotRowChangeEvent: RowChangeEvent
  @JSName("com.sun.star.sdb.RowsChangeEvent")
  var comDotsunDotstarDotsdbDotRowsChangeEvent: RowsChangeEvent
  @JSName("com.sun.star.sdb.SQLErrorEvent")
  var comDotsunDotstarDotsdbDotSQLErrorEvent: SQLErrorEvent
  @JSName("com.sun.star.sdb.application.CopyTableRowEvent")
  var comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent: CopyTableRowEvent
  @JSName("com.sun.star.sdb.application.NamedDatabaseObject")
  var comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject: NamedDatabaseObject
  @JSName("com.sun.star.sdbc.ChangeEvent")
  var comDotsunDotstarDotsdbcDotChangeEvent: ChangeEvent
  @JSName("com.sun.star.sdbc.DriverPropertyInfo")
  var comDotsunDotstarDotsdbcDotDriverPropertyInfo: DriverPropertyInfo
  @JSName("com.sun.star.security.AllPermission")
  var comDotsunDotstarDotsecurityDotAllPermission: AllPermission
  @JSName("com.sun.star.security.CertAltNameEntry")
  var comDotsunDotstarDotsecurityDotCertAltNameEntry: CertAltNameEntry
  @JSName("com.sun.star.security.DocumentSignatureInformation")
  var comDotsunDotstarDotsecurityDotDocumentSignatureInformation: DocumentSignatureInformation
  @JSName("com.sun.star.security.RuntimePermission")
  var comDotsunDotstarDotsecurityDotRuntimePermission: RuntimePermission
  @JSName("com.sun.star.sheet.ActivationEvent")
  var comDotsunDotstarDotsheetDotActivationEvent: ActivationEvent
  @JSName("com.sun.star.sheet.ComplexReference")
  var comDotsunDotstarDotsheetDotComplexReference: ComplexReference
  @JSName("com.sun.star.sheet.DDEItemInfo")
  var comDotsunDotstarDotsheetDotDDEItemInfo: DDEItemInfo
  @JSName("com.sun.star.sheet.DDELinkInfo")
  var comDotsunDotstarDotsheetDotDDELinkInfo: DDELinkInfo
  @JSName("com.sun.star.sheet.DataPilotFieldAutoShowInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo: DataPilotFieldAutoShowInfo
  @JSName("com.sun.star.sheet.DataPilotFieldFilter")
  var comDotsunDotstarDotsheetDotDataPilotFieldFilter: DataPilotFieldFilter
  @JSName("com.sun.star.sheet.DataPilotFieldGroupInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo: DataPilotFieldGroupInfo
  @JSName("com.sun.star.sheet.DataPilotFieldLayoutInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo: DataPilotFieldLayoutInfo
  @JSName("com.sun.star.sheet.DataPilotFieldReference")
  var comDotsunDotstarDotsheetDotDataPilotFieldReference: DataPilotFieldReference
  @JSName("com.sun.star.sheet.DataPilotFieldSortInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldSortInfo: DataPilotFieldSortInfo
  @JSName("com.sun.star.sheet.DataPilotTableHeaderData")
  var comDotsunDotstarDotsheetDotDataPilotTableHeaderData: DataPilotTableHeaderData
  @JSName("com.sun.star.sheet.DataPilotTablePositionData")
  var comDotsunDotstarDotsheetDotDataPilotTablePositionData: DataPilotTablePositionData
  @JSName("com.sun.star.sheet.DataPilotTableResultData")
  var comDotsunDotstarDotsheetDotDataPilotTableResultData: DataPilotTableResultData
  @JSName("com.sun.star.sheet.DataResult")
  var comDotsunDotstarDotsheetDotDataResult: DataResult
  @JSName("com.sun.star.sheet.ExternalLinkInfo")
  var comDotsunDotstarDotsheetDotExternalLinkInfo: ExternalLinkInfo
  @JSName("com.sun.star.sheet.ExternalReference")
  var comDotsunDotstarDotsheetDotExternalReference: ExternalReference
  @JSName("com.sun.star.sheet.FilterFieldValue")
  var comDotsunDotstarDotsheetDotFilterFieldValue: FilterFieldValue
  @JSName("com.sun.star.sheet.FormulaOpCodeMapEntry")
  var comDotsunDotstarDotsheetDotFormulaOpCodeMapEntry: FormulaOpCodeMapEntry
  @JSName("com.sun.star.sheet.FormulaToken")
  var comDotsunDotstarDotsheetDotFormulaToken: FormulaToken
  @JSName("com.sun.star.sheet.FunctionArgument")
  var comDotsunDotstarDotsheetDotFunctionArgument: FunctionArgument
  @JSName("com.sun.star.sheet.GoalResult")
  var comDotsunDotstarDotsheetDotGoalResult: GoalResult
  @JSName("com.sun.star.sheet.LocalizedName")
  var comDotsunDotstarDotsheetDotLocalizedName: LocalizedName
  @JSName("com.sun.star.sheet.MemberResult")
  var comDotsunDotstarDotsheetDotMemberResult: MemberResult
  @JSName("com.sun.star.sheet.NameToken")
  var comDotsunDotstarDotsheetDotNameToken: NameToken
  @JSName("com.sun.star.sheet.RangeSelectionEvent")
  var comDotsunDotstarDotsheetDotRangeSelectionEvent: RangeSelectionEvent
  @JSName("com.sun.star.sheet.ResultEvent")
  var comDotsunDotstarDotsheetDotResultEvent: ResultEvent
  @JSName("com.sun.star.sheet.SingleReference")
  var comDotsunDotstarDotsheetDotSingleReference: SingleReference
  @JSName("com.sun.star.sheet.SolverConstraint")
  var comDotsunDotstarDotsheetDotSolverConstraint: SolverConstraint
  @JSName("com.sun.star.sheet.SubTotalColumn")
  var comDotsunDotstarDotsheetDotSubTotalColumn: SubTotalColumn
  @JSName("com.sun.star.sheet.TableFilterField")
  var comDotsunDotstarDotsheetDotTableFilterField: TableFilterField
  @JSName("com.sun.star.sheet.TableFilterField2")
  var comDotsunDotstarDotsheetDotTableFilterField2: TableFilterField2
  @JSName("com.sun.star.sheet.TableFilterField3")
  var comDotsunDotstarDotsheetDotTableFilterField3: TableFilterField3
  @JSName("com.sun.star.sheet.TablePageBreakData")
  var comDotsunDotstarDotsheetDotTablePageBreakData: TablePageBreakData
  @JSName("com.sun.star.sheet.opencl.OpenCLDevice")
  var comDotsunDotstarDotsheetDotopenclDotOpenCLDevice: OpenCLDevice
  @JSName("com.sun.star.sheet.opencl.OpenCLPlatform")
  var comDotsunDotstarDotsheetDotopenclDotOpenCLPlatform: OpenCLPlatform
  @JSName("com.sun.star.style.DropCapFormat")
  var comDotsunDotstarDotstyleDotDropCapFormat: DropCapFormat
  @JSName("com.sun.star.style.LineSpacing")
  var comDotsunDotstarDotstyleDotLineSpacing: LineSpacing
  @JSName("com.sun.star.style.TabStop")
  var comDotsunDotstarDotstyleDotTabStop: TabStop
  @JSName("com.sun.star.table.BorderLine")
  var comDotsunDotstarDottableDotBorderLine: BorderLine
  @JSName("com.sun.star.table.BorderLine2")
  var comDotsunDotstarDottableDotBorderLine2: BorderLine2
  @JSName("com.sun.star.table.CellAddress")
  var comDotsunDotstarDottableDotCellAddress: CellAddress
  @JSName("com.sun.star.table.CellRangeAddress")
  var comDotsunDotstarDottableDotCellRangeAddress: CellRangeAddress
  @JSName("com.sun.star.table.ShadowFormat")
  var comDotsunDotstarDottableDotShadowFormat: ShadowFormat
  @JSName("com.sun.star.table.TableBorder")
  var comDotsunDotstarDottableDotTableBorder: TableBorder
  @JSName("com.sun.star.table.TableBorder2")
  var comDotsunDotstarDottableDotTableBorder2: TableBorder2
  @JSName("com.sun.star.table.TableBorderDistances")
  var comDotsunDotstarDottableDotTableBorderDistances: TableBorderDistances
  @JSName("com.sun.star.table.TableSortField")
  var comDotsunDotstarDottableDotTableSortField: TableSortField
  @JSName("com.sun.star.task.UrlRecord")
  var comDotsunDotstarDottaskDotUrlRecord: UrlRecord
  @JSName("com.sun.star.task.UserRecord")
  var comDotsunDotstarDottaskDotUserRecord: UserRecord
  @JSName("com.sun.star.text.GraphicCrop")
  var comDotsunDotstarDottextDotGraphicCrop: GraphicCrop
  @JSName("com.sun.star.text.HoriOrientationFormat")
  var comDotsunDotstarDottextDotHoriOrientationFormat: HoriOrientationFormat
  @JSName("com.sun.star.text.MailMergeEvent")
  var comDotsunDotstarDottextDotMailMergeEvent: MailMergeEvent
  @JSName("com.sun.star.text.SectionFileLink")
  var comDotsunDotstarDottextDotSectionFileLink: SectionFileLink
  @JSName("com.sun.star.text.TableColumnSeparator")
  var comDotsunDotstarDottextDotTableColumnSeparator: TableColumnSeparator
  @JSName("com.sun.star.text.TextColumn")
  var comDotsunDotstarDottextDotTextColumn: TextColumn
  @JSName("com.sun.star.text.TextMarkupDescriptor")
  var comDotsunDotstarDottextDotTextMarkupDescriptor: TextMarkupDescriptor
  @JSName("com.sun.star.text.TextPosition")
  var comDotsunDotstarDottextDotTextPosition: TextPosition
  @JSName("com.sun.star.text.TextRangeSelection")
  var comDotsunDotstarDottextDotTextRangeSelection: TextRangeSelection
  @JSName("com.sun.star.text.VertOrientationFormat")
  var comDotsunDotstarDottextDotVertOrientationFormat: VertOrientationFormat
  @JSName("com.sun.star.ucb.CheckinArgument")
  var comDotsunDotstarDotucbDotCheckinArgument: CheckinArgument
  @JSName("com.sun.star.ucb.Command")
  var comDotsunDotstarDotucbDotCommand: Command
  @JSName("com.sun.star.ucb.CommandInfo")
  var comDotsunDotstarDotucbDotCommandInfo: CommandInfo
  @JSName("com.sun.star.ucb.CommandInfoChangeEvent")
  var comDotsunDotstarDotucbDotCommandInfoChangeEvent: CommandInfoChangeEvent
  @JSName("com.sun.star.ucb.ContentEvent")
  var comDotsunDotstarDotucbDotContentEvent: ContentEvent
  @JSName("com.sun.star.ucb.ContentInfo")
  var comDotsunDotstarDotucbDotContentInfo: ContentInfo
  @JSName("com.sun.star.ucb.ContentProviderInfo")
  var comDotsunDotstarDotucbDotContentProviderInfo: ContentProviderInfo
  @JSName("com.sun.star.ucb.CrossReference")
  var comDotsunDotstarDotucbDotCrossReference: CrossReference
  @JSName("com.sun.star.ucb.DocumentHeaderField")
  var comDotsunDotstarDotucbDotDocumentHeaderField: DocumentHeaderField
  @JSName("com.sun.star.ucb.ExportStreamInfo")
  var comDotsunDotstarDotucbDotExportStreamInfo: ExportStreamInfo
  @JSName("com.sun.star.ucb.FetchResult")
  var comDotsunDotstarDotucbDotFetchResult: FetchResult
  @JSName("com.sun.star.ucb.FolderList")
  var comDotsunDotstarDotucbDotFolderList: FolderList
  @JSName("com.sun.star.ucb.FolderListEntry")
  var comDotsunDotstarDotucbDotFolderListEntry: FolderListEntry
  @JSName("com.sun.star.ucb.GlobalTransferCommandArgument")
  var comDotsunDotstarDotucbDotGlobalTransferCommandArgument: GlobalTransferCommandArgument
  @JSName("com.sun.star.ucb.GlobalTransferCommandArgument2")
  var comDotsunDotstarDotucbDotGlobalTransferCommandArgument2: GlobalTransferCommandArgument2
  @JSName("com.sun.star.ucb.InsertCommandArgument")
  var comDotsunDotstarDotucbDotInsertCommandArgument: InsertCommandArgument
  @JSName("com.sun.star.ucb.InsertCommandArgument2")
  var comDotsunDotstarDotucbDotInsertCommandArgument2: InsertCommandArgument2
  @JSName("com.sun.star.ucb.Link")
  var comDotsunDotstarDotucbDotLink: Link
  @JSName("com.sun.star.ucb.ListAction")
  var comDotsunDotstarDotucbDotListAction: ListAction
  @JSName("com.sun.star.ucb.ListEvent")
  var comDotsunDotstarDotucbDotListEvent: ListEvent
  @JSName("com.sun.star.ucb.Lock")
  var comDotsunDotstarDotucbDotLock: Lock
  @JSName("com.sun.star.ucb.LockEntry")
  var comDotsunDotstarDotucbDotLockEntry: LockEntry
  @JSName("com.sun.star.ucb.NumberedSortingInfo")
  var comDotsunDotstarDotucbDotNumberedSortingInfo: NumberedSortingInfo
  @JSName("com.sun.star.ucb.OpenCommandArgument")
  var comDotsunDotstarDotucbDotOpenCommandArgument: OpenCommandArgument
  @JSName("com.sun.star.ucb.OpenCommandArgument2")
  var comDotsunDotstarDotucbDotOpenCommandArgument2: OpenCommandArgument2
  @JSName("com.sun.star.ucb.OpenCommandArgument3")
  var comDotsunDotstarDotucbDotOpenCommandArgument3: OpenCommandArgument3
  @JSName("com.sun.star.ucb.PostCommandArgument")
  var comDotsunDotstarDotucbDotPostCommandArgument: PostCommandArgument
  @JSName("com.sun.star.ucb.PostCommandArgument2")
  var comDotsunDotstarDotucbDotPostCommandArgument2: PostCommandArgument2
  @JSName("com.sun.star.ucb.PropertyCommandArgument")
  var comDotsunDotstarDotucbDotPropertyCommandArgument: PropertyCommandArgument
  @JSName("com.sun.star.ucb.PropertyValueInfo")
  var comDotsunDotstarDotucbDotPropertyValueInfo: PropertyValueInfo
  @JSName("com.sun.star.ucb.RecipientInfo")
  var comDotsunDotstarDotucbDotRecipientInfo: RecipientInfo
  @JSName("com.sun.star.ucb.RemoteContentProviderChangeEvent")
  var comDotsunDotstarDotucbDotRemoteContentProviderChangeEvent: RemoteContentProviderChangeEvent
  @JSName("com.sun.star.ucb.Rule")
  var comDotsunDotstarDotucbDotRule: Rule
  @JSName("com.sun.star.ucb.RuleSet")
  var comDotsunDotstarDotucbDotRuleSet: RuleSet
  @JSName("com.sun.star.ucb.RuleTerm")
  var comDotsunDotstarDotucbDotRuleTerm: RuleTerm
  @JSName("com.sun.star.ucb.SearchCommandArgument")
  var comDotsunDotstarDotucbDotSearchCommandArgument: SearchCommandArgument
  @JSName("com.sun.star.ucb.SearchCriterium")
  var comDotsunDotstarDotucbDotSearchCriterium: SearchCriterium
  @JSName("com.sun.star.ucb.SearchInfo")
  var comDotsunDotstarDotucbDotSearchInfo: SearchInfo
  @JSName("com.sun.star.ucb.SendInfo")
  var comDotsunDotstarDotucbDotSendInfo: SendInfo
  @JSName("com.sun.star.ucb.SendMediaTypes")
  var comDotsunDotstarDotucbDotSendMediaTypes: SendMediaTypes
  @JSName("com.sun.star.ucb.SortingInfo")
  var comDotsunDotstarDotucbDotSortingInfo: SortingInfo
  @JSName("com.sun.star.ucb.TransferInfo")
  var comDotsunDotstarDotucbDotTransferInfo: TransferInfo
  @JSName("com.sun.star.ucb.TransferInfo2")
  var comDotsunDotstarDotucbDotTransferInfo2: TransferInfo2
  @JSName("com.sun.star.ucb.TransferResult")
  var comDotsunDotstarDotucbDotTransferResult: TransferResult
  @JSName("com.sun.star.ucb.WelcomeDynamicResultSetStruct")
  var comDotsunDotstarDotucbDotWelcomeDynamicResultSetStruct: WelcomeDynamicResultSetStruct
  @JSName("com.sun.star.ui.ConfigurationEvent")
  var comDotsunDotstarDotuiDotConfigurationEvent: ConfigurationEvent
  @JSName("com.sun.star.ui.ContextChangeEventObject")
  var comDotsunDotstarDotuiDotContextChangeEventObject: ContextChangeEventObject
  @JSName("com.sun.star.ui.ContextMenuExecuteEvent")
  var comDotsunDotstarDotuiDotContextMenuExecuteEvent: ContextMenuExecuteEvent
  @JSName("com.sun.star.ui.LayoutSize")
  var comDotsunDotstarDotuiDotLayoutSize: LayoutSize
  @JSName("com.sun.star.ui.dialogs.DialogClosedEvent")
  var comDotsunDotstarDotuiDotdialogsDotDialogClosedEvent: DialogClosedEvent
  @JSName("com.sun.star.ui.dialogs.FilePickerEvent")
  var comDotsunDotstarDotuiDotdialogsDotFilePickerEvent: FilePickerEvent
  @JSName("com.sun.star.uno.Uik")
  var comDotsunDotstarDotunoDotUik: Uik
  @JSName("com.sun.star.util.AliasProgrammaticPair")
  var comDotsunDotstarDotutilDotAliasProgrammaticPair: AliasProgrammaticPair
  @JSName("com.sun.star.util.AtomClassRequest")
  var comDotsunDotstarDotutilDotAtomClassRequest: AtomClassRequest
  @JSName("com.sun.star.util.AtomDescription")
  var comDotsunDotstarDotutilDotAtomDescription: AtomDescription
  @JSName("com.sun.star.util.CellProtection")
  var comDotsunDotstarDotutilDotCellProtection: CellProtection
  @JSName("com.sun.star.util.ChangesEvent")
  var comDotsunDotstarDotutilDotChangesEvent: ChangesEvent
  @JSName("com.sun.star.util.DataEditorEvent")
  var comDotsunDotstarDotutilDotDataEditorEvent: DataEditorEvent
  @JSName("com.sun.star.util.Date")
  var comDotsunDotstarDotutilDotDate: typings.activexLibreoffice.com_.sun.star.util.Date
  @JSName("com.sun.star.util.DateTime")
  var comDotsunDotstarDotutilDotDateTime: DateTime
  @JSName("com.sun.star.util.DateTimeRange")
  var comDotsunDotstarDotutilDotDateTimeRange: DateTimeRange
  @JSName("com.sun.star.util.DateTimeWithTimezone")
  var comDotsunDotstarDotutilDotDateTimeWithTimezone: DateTimeWithTimezone
  @JSName("com.sun.star.util.DateWithTimezone")
  var comDotsunDotstarDotutilDotDateWithTimezone: DateWithTimezone
  @JSName("com.sun.star.util.Duration")
  var comDotsunDotstarDotutilDotDuration: Duration
  @JSName("com.sun.star.util.ElementChange")
  var comDotsunDotstarDotutilDotElementChange: ElementChange
  @JSName("com.sun.star.util.ModeChangeEvent")
  var comDotsunDotstarDotutilDotModeChangeEvent: ModeChangeEvent
  @JSName("com.sun.star.util.RevisionTag")
  var comDotsunDotstarDotutilDotRevisionTag: RevisionTag
  @JSName("com.sun.star.util.SearchOptions")
  var comDotsunDotstarDotutilDotSearchOptions: SearchOptions
  @JSName("com.sun.star.util.SearchOptions2")
  var comDotsunDotstarDotutilDotSearchOptions2: SearchOptions2
  @JSName("com.sun.star.util.SearchResult")
  var comDotsunDotstarDotutilDotSearchResult: SearchResult
  @JSName("com.sun.star.util.SortField")
  var comDotsunDotstarDotutilDotSortField: SortField
  @JSName("com.sun.star.util.Time")
  var comDotsunDotstarDotutilDotTime: Time
  @JSName("com.sun.star.util.TimeWithTimezone")
  var comDotsunDotstarDotutilDotTimeWithTimezone: TimeWithTimezone
  @JSName("com.sun.star.util.URL")
  var comDotsunDotstarDotutilDotURL: URL
  @JSName("com.sun.star.view.PrintJobEvent")
  var comDotsunDotstarDotviewDotPrintJobEvent: PrintJobEvent
  @JSName("com.sun.star.view.PrintableStateEvent")
  var comDotsunDotstarDotviewDotPrintableStateEvent: PrintableStateEvent
  @JSName("com.sun.star.xml.Attribute")
  var comDotsunDotstarDotxmlDotAttribute: Attribute
  @JSName("com.sun.star.xml.AttributeData")
  var comDotsunDotstarDotxmlDotAttributeData: AttributeData
  @JSName("com.sun.star.xml.FastAttribute")
  var comDotsunDotstarDotxmlDotFastAttribute: FastAttribute
  @JSName("com.sun.star.xml.crypto.sax.ElementStackItem")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotElementStackItem: ElementStackItem
  @JSName("com.sun.star.xml.csax.XMLAttribute")
  var comDotsunDotstarDotxmlDotcsaxDotXMLAttribute: XMLAttribute
  @JSName("com.sun.star.xml.sax.InputSource")
  var comDotsunDotstarDotxmlDotsaxDotInputSource: InputSource
  @JSName("com.sun.star.xml.xpath.Libxml2ExtensionHandle")
  var comDotsunDotstarDotxmlDotxpathDotLibxml2ExtensionHandle: Libxml2ExtensionHandle
}

object StructNameMap {
  @scala.inline
  def apply(
    comDotsunDotstarDotaccessibilityDotAccessibleEventObject: AccessibleEventObject,
    comDotsunDotstarDotaccessibilityDotAccessibleRelation: AccessibleRelation,
    comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange: AccessibleTableModelChange,
    comDotsunDotstarDotaccessibilityDotTextSegment: TextSegment,
    comDotsunDotstarDotanimationsDotEvent: Event,
    comDotsunDotstarDotanimationsDotTargetProperties: TargetProperties,
    comDotsunDotstarDotanimationsDotTimeFilterPair: TimeFilterPair,
    comDotsunDotstarDotanimationsDotValuePair: ValuePair,
    comDotsunDotstarDotawtDotActionEvent: ActionEvent,
    comDotsunDotstarDotawtDotAdjustmentEvent: AdjustmentEvent,
    comDotsunDotstarDotawtDotDeviceInfo: DeviceInfo,
    comDotsunDotstarDotawtDotDockingData: DockingData,
    comDotsunDotstarDotawtDotDockingEvent: DockingEvent,
    comDotsunDotstarDotawtDotEndDockingEvent: EndDockingEvent,
    comDotsunDotstarDotawtDotEndPopupModeEvent: EndPopupModeEvent,
    comDotsunDotstarDotawtDotEnhancedMouseEvent: EnhancedMouseEvent,
    comDotsunDotstarDotawtDotFocusEvent: FocusEvent,
    comDotsunDotstarDotawtDotFontDescriptor: FontDescriptor,
    comDotsunDotstarDotawtDotGradient: Gradient,
    comDotsunDotstarDotawtDotInputEvent: InputEvent,
    comDotsunDotstarDotawtDotItemEvent: ItemEvent,
    comDotsunDotstarDotawtDotItemListEvent: ItemListEvent,
    comDotsunDotstarDotawtDotKeyEvent: KeyEvent,
    comDotsunDotstarDotawtDotKeyStroke: KeyStroke,
    comDotsunDotstarDotawtDotMenuEvent: MenuEvent,
    comDotsunDotstarDotawtDotMouseEvent: MouseEvent,
    comDotsunDotstarDotawtDotPaintEvent: PaintEvent,
    comDotsunDotstarDotawtDotPoint: Point,
    comDotsunDotstarDotawtDotRectangle: Rectangle,
    comDotsunDotstarDotawtDotSelection: Selection,
    comDotsunDotstarDotawtDotSimpleFontMetric: SimpleFontMetric,
    comDotsunDotstarDotawtDotSize: Size,
    comDotsunDotstarDotawtDotSpinEvent: SpinEvent,
    comDotsunDotstarDotawtDotSystemDependentXWindow: SystemDependentXWindow,
    comDotsunDotstarDotawtDotTextEvent: TextEvent,
    comDotsunDotstarDotawtDotVclContainerEvent: VclContainerEvent,
    comDotsunDotstarDotawtDotWindowDescriptor: WindowDescriptor,
    comDotsunDotstarDotawtDotWindowEvent: WindowEvent,
    comDotsunDotstarDotawtDotgridDotGridColumnEvent: GridColumnEvent,
    comDotsunDotstarDotawtDotgridDotGridDataEvent: GridDataEvent,
    comDotsunDotstarDotawtDotgridDotGridSelectionEvent: GridSelectionEvent,
    comDotsunDotstarDotawtDottabDotTabPageActivatedEvent: TabPageActivatedEvent,
    comDotsunDotstarDotawtDottreeDotTreeDataModelEvent: TreeDataModelEvent,
    comDotsunDotstarDotawtDottreeDotTreeExpansionEvent: TreeExpansionEvent,
    comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult: GetDirectPropertyTolerantResult,
    comDotsunDotstarDotbeansDotGetPropertyTolerantResult: GetPropertyTolerantResult,
    comDotsunDotstarDotbeansDotNamedValue: NamedValue,
    comDotsunDotstarDotbeansDotProperty: Property,
    comDotsunDotstarDotbeansDotPropertyChangeEvent: PropertyChangeEvent,
    comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent: PropertySetInfoChangeEvent,
    comDotsunDotstarDotbeansDotPropertyStateChangeEvent: PropertyStateChangeEvent,
    comDotsunDotstarDotbeansDotPropertyValue: PropertyValue,
    comDotsunDotstarDotbeansDotSetPropertyTolerantFailed: SetPropertyTolerantFailed,
    comDotsunDotstarDotbeansDotStringPair: StringPair,
    comDotsunDotstarDotbridgeDotProtocolProperty: ProtocolProperty,
    comDotsunDotstarDotbridgeDotoleautomationDotCurrency: Currency,
    comDotsunDotstarDotbridgeDotoleautomationDotDate: Date,
    comDotsunDotstarDotbridgeDotoleautomationDotDecimal: Decimal,
    comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument: NamedArgument,
    comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument: PropertyPutArgument,
    comDotsunDotstarDotbridgeDotoleautomationDotSCode: SCode,
    comDotsunDotstarDotchart2DotDataPointLabel: DataPointLabel,
    comDotsunDotstarDotchart2DotFillBitmap: FillBitmap,
    comDotsunDotstarDotchart2DotIncrementData: IncrementData,
    comDotsunDotstarDotchart2DotInterpretedData: InterpretedData,
    comDotsunDotstarDotchart2DotLightSource: LightSource,
    comDotsunDotstarDotchart2DotRelativePosition: RelativePosition,
    comDotsunDotstarDotchart2DotRelativeSize: RelativeSize,
    comDotsunDotstarDotchart2DotScaleData: ScaleData,
    comDotsunDotstarDotchart2DotSubIncrement: SubIncrement,
    comDotsunDotstarDotchart2DotSymbol: Symbol,
    comDotsunDotstarDotchart2DotdataDotHighlightedRange: HighlightedRange,
    comDotsunDotstarDotchartDotChartDataChangeEvent: ChartDataChangeEvent,
    comDotsunDotstarDotchartDotChartDataRow: ChartDataRow,
    comDotsunDotstarDotchartDotChartDataValue: ChartDataValue,
    comDotsunDotstarDotchartDotChartSeriesAddress: ChartSeriesAddress,
    comDotsunDotstarDotchartDotTimeIncrement: TimeIncrement,
    comDotsunDotstarDotchartDotTimeInterval: TimeInterval,
    comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent: ComponentChangeEvent,
    comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo: PropertyInfo,
    comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier: TemplateIdentifier,
    comDotsunDotstarDotconnectionDotSocketPermission: SocketPermission,
    comDotsunDotstarDotcontainerDotContainerEvent: ContainerEvent,
    comDotsunDotstarDotdatatransferDotDataFlavor: DataFlavor,
    comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent: ClipboardEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent: DragGestureEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent: DragSourceDragEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent: DragSourceDropEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent: DragSourceEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent: DropTargetDragEnterEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent: DropTargetDragEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent: DropTargetDropEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent: DropTargetEvent,
    comDotsunDotstarDotdeploymentDotUpdateInformationEntry: UpdateInformationEntry,
    comDotsunDotstarDotdocumentDotCmisProperty: CmisProperty,
    comDotsunDotstarDotdocumentDotCmisVersion: CmisVersion,
    comDotsunDotstarDotdocumentDotDocumentEvent: DocumentEvent,
    comDotsunDotstarDotdocumentDotEventObject: EventObject,
    comDotsunDotstarDotdocumentDotUndoManagerEvent: UndoManagerEvent,
    comDotsunDotstarDotdrawingDotBezierPoint: BezierPoint,
    comDotsunDotstarDotdrawingDotBoundVolume: BoundVolume,
    comDotsunDotstarDotdrawingDotCameraGeometry: CameraGeometry,
    comDotsunDotstarDotdrawingDotDirection3D: Direction3D,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue: EnhancedCustomShapeAdjustmentValue,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter: EnhancedCustomShapeParameter,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair: EnhancedCustomShapeParameterPair,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment: EnhancedCustomShapeSegment,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame: EnhancedCustomShapeTextFrame,
    comDotsunDotstarDotdrawingDotGluePoint: GluePoint,
    comDotsunDotstarDotdrawingDotGluePoint2: GluePoint2,
    comDotsunDotstarDotdrawingDotHatch: Hatch,
    comDotsunDotstarDotdrawingDotHomogenMatrix: HomogenMatrix,
    comDotsunDotstarDotdrawingDotHomogenMatrix3: HomogenMatrix3,
    comDotsunDotstarDotdrawingDotHomogenMatrix4: HomogenMatrix4,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine: HomogenMatrixLine,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine3: HomogenMatrixLine3,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine4: HomogenMatrixLine4,
    comDotsunDotstarDotdrawingDotLineDash: LineDash,
    comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords: PolyPolygonBezierCoords,
    comDotsunDotstarDotdrawingDotPolyPolygonShape3D: PolyPolygonShape3D,
    comDotsunDotstarDotdrawingDotPosition3D: Position3D,
    comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent: ConfigurationChangeEvent,
    comDotsunDotstarDotdrawingDotframeworkDotTabBarButton: TabBarButton,
    comDotsunDotstarDotembedDotInsertedObjectInfo: InsertedObjectInfo,
    comDotsunDotstarDotembedDotVerbDescriptor: VerbDescriptor,
    comDotsunDotstarDotembedDotVisualRepresentation: VisualRepresentation,
    comDotsunDotstarDotformDotDatabaseDeleteEvent: DatabaseDeleteEvent,
    comDotsunDotstarDotformDotDatabaseParameterEvent: DatabaseParameterEvent,
    comDotsunDotstarDotformDotErrorEvent: ErrorEvent,
    comDotsunDotstarDotformDotbindingDotListEntryEvent: ListEntryEvent,
    comDotsunDotstarDotformDotruntimeDotFeatureState: FeatureState,
    comDotsunDotstarDotformDotruntimeDotFilterEvent: FilterEvent,
    comDotsunDotstarDotformulaDotSymbolDescriptor: SymbolDescriptor,
    comDotsunDotstarDotframeDotBorderWidths: BorderWidths,
    comDotsunDotstarDotframeDotControlCommand: ControlCommand,
    comDotsunDotstarDotframeDotControlEvent: ControlEvent,
    comDotsunDotstarDotframeDotDispatchDescriptor: DispatchDescriptor,
    comDotsunDotstarDotframeDotDispatchInformation: DispatchInformation,
    comDotsunDotstarDotframeDotDispatchResultEvent: DispatchResultEvent,
    comDotsunDotstarDotframeDotDispatchStatement: DispatchStatement,
    comDotsunDotstarDotframeDotFeatureStateEvent: FeatureStateEvent,
    comDotsunDotstarDotframeDotFrameActionEvent: FrameActionEvent,
    comDotsunDotstarDotframeDotTitleChangedEvent: TitleChangedEvent,
    comDotsunDotstarDotframeDotstatusDotClipboardFormats: ClipboardFormats,
    comDotsunDotstarDotframeDotstatusDotFontHeight: FontHeight,
    comDotsunDotstarDotframeDotstatusDotItemStatus: ItemStatus,
    comDotsunDotstarDotframeDotstatusDotLeftRightMargin: LeftRightMargin,
    comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale: LeftRightMarginScale,
    comDotsunDotstarDotframeDotstatusDotTemplate: Template,
    comDotsunDotstarDotframeDotstatusDotUpperLowerMargin: UpperLowerMargin,
    comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale: UpperLowerMarginScale,
    comDotsunDotstarDotframeDotstatusDotVerb: Verb,
    comDotsunDotstarDotframeDotstatusDotVisibility: Visibility,
    comDotsunDotstarDotgeometryDotAffineMatrix2D: AffineMatrix2D,
    comDotsunDotstarDotgeometryDotAffineMatrix3D: AffineMatrix3D,
    comDotsunDotstarDotgeometryDotEllipticalArc: EllipticalArc,
    comDotsunDotstarDotgeometryDotIntegerBezierSegment2D: IntegerBezierSegment2D,
    comDotsunDotstarDotgeometryDotIntegerPoint2D: IntegerPoint2D,
    comDotsunDotstarDotgeometryDotIntegerRectangle2D: IntegerRectangle2D,
    comDotsunDotstarDotgeometryDotIntegerSize2D: IntegerSize2D,
    comDotsunDotstarDotgeometryDotMatrix2D: Matrix2D,
    comDotsunDotstarDotgeometryDotRealBezierSegment2D: RealBezierSegment2D,
    comDotsunDotstarDotgeometryDotRealPoint2D: RealPoint2D,
    comDotsunDotstarDotgeometryDotRealRectangle2D: RealRectangle2D,
    comDotsunDotstarDotgeometryDotRealRectangle3D: RealRectangle3D,
    comDotsunDotstarDotgeometryDotRealSize2D: RealSize2D,
    comDotsunDotstarDoti18nDotBoundary: Boundary,
    comDotsunDotstarDoti18nDotCalendar: Calendar,
    comDotsunDotstarDoti18nDotCalendar2: Calendar2,
    comDotsunDotstarDoti18nDotCalendarItem: CalendarItem,
    comDotsunDotstarDoti18nDotCalendarItem2: CalendarItem2,
    comDotsunDotstarDoti18nDotCurrency: typings.activexLibreoffice.com_.sun.star.i18n.Currency,
    comDotsunDotstarDoti18nDotCurrency2: Currency2,
    comDotsunDotstarDoti18nDotForbiddenCharacters: ForbiddenCharacters,
    comDotsunDotstarDoti18nDotFormatElement: FormatElement,
    comDotsunDotstarDoti18nDotImplementation: Implementation,
    comDotsunDotstarDoti18nDotLanguageCountryInfo: LanguageCountryInfo,
    comDotsunDotstarDoti18nDotLineBreakHyphenationOptions: LineBreakHyphenationOptions,
    comDotsunDotstarDoti18nDotLineBreakResults: LineBreakResults,
    comDotsunDotstarDoti18nDotLineBreakUserOptions: LineBreakUserOptions,
    comDotsunDotstarDoti18nDotLocaleDataItem: LocaleDataItem,
    comDotsunDotstarDoti18nDotNativeNumberXmlAttributes: NativeNumberXmlAttributes,
    comDotsunDotstarDoti18nDotNumberFormatCode: NumberFormatCode,
    comDotsunDotstarDoti18nDotParseResult: ParseResult,
    comDotsunDotstarDoti18nDotTextConversionResult: TextConversionResult,
    comDotsunDotstarDotinspectionDotLineDescriptor: LineDescriptor,
    comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor: PropertyCategoryDescriptor,
    comDotsunDotstarDotioDotDataTransferEvent: DataTransferEvent,
    comDotsunDotstarDotioDotFilePermission: FilePermission,
    comDotsunDotstarDotlangDotEventObject: typings.activexLibreoffice.com_.sun.star.lang.EventObject,
    comDotsunDotstarDotlangDotLocale: Locale,
    comDotsunDotstarDotlinguistic2DotDictionaryEvent: DictionaryEvent,
    comDotsunDotstarDotlinguistic2DotDictionaryListEvent: DictionaryListEvent,
    comDotsunDotstarDotlinguistic2DotLinguServiceEvent: LinguServiceEvent,
    comDotsunDotstarDotlinguistic2DotProofreadingResult: ProofreadingResult,
    comDotsunDotstarDotlinguistic2DotSingleProofreadingError: SingleProofreadingError,
    comDotsunDotstarDotloggingDotLogRecord: LogRecord,
    comDotsunDotstarDotmailDotMailAttachment: MailAttachment,
    comDotsunDotstarDotmozillaDotMenuMultipleChange: MenuMultipleChange,
    comDotsunDotstarDotmozillaDotMenuSingleChange: MenuSingleChange,
    comDotsunDotstarDotpackagesDotzipDotZipEntry: ZipEntry,
    comDotsunDotstarDotpresentationDotParagraphTarget: ParagraphTarget,
    comDotsunDotstarDotrdfDotStatement: Statement,
    comDotsunDotstarDotreflectionDotParamInfo: ParamInfo,
    comDotsunDotstarDotrenderingDotARGBColor: ARGBColor,
    comDotsunDotstarDotrenderingDotAnimationAttributes: AnimationAttributes,
    comDotsunDotstarDotrenderingDotCaret: Caret,
    comDotsunDotstarDotrenderingDotColorProfile: ColorProfile,
    comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout: FloatingPointBitmapLayout,
    comDotsunDotstarDotrenderingDotFontInfo: FontInfo,
    comDotsunDotstarDotrenderingDotFontMetrics: FontMetrics,
    comDotsunDotstarDotrenderingDotFontRequest: FontRequest,
    comDotsunDotstarDotrenderingDotIntegerBitmapLayout: IntegerBitmapLayout,
    comDotsunDotstarDotrenderingDotPanose: Panose,
    comDotsunDotstarDotrenderingDotRGBColor: RGBColor,
    comDotsunDotstarDotrenderingDotRenderState: RenderState,
    comDotsunDotstarDotrenderingDotStringContext: StringContext,
    comDotsunDotstarDotrenderingDotStrokeAttributes: StrokeAttributes,
    comDotsunDotstarDotrenderingDotTextHit: TextHit,
    comDotsunDotstarDotrenderingDotTexture: Texture,
    comDotsunDotstarDotrenderingDotViewState: ViewState,
    comDotsunDotstarDotscannerDotScannerContext: ScannerContext,
    comDotsunDotstarDotscriptDotAllEventObject: AllEventObject,
    comDotsunDotstarDotscriptDotArrayWrapper: ArrayWrapper,
    comDotsunDotstarDotscriptDotContextInformation: ContextInformation,
    comDotsunDotstarDotscriptDotEventListener: EventListener,
    comDotsunDotstarDotscriptDotFinishEngineEvent: FinishEngineEvent,
    comDotsunDotstarDotscriptDotInterruptEngineEvent: InterruptEngineEvent,
    comDotsunDotstarDotscriptDotInvocationInfo: InvocationInfo,
    comDotsunDotstarDotscriptDotModuleInfo: ModuleInfo,
    comDotsunDotstarDotscriptDotNativeObjectWrapper: NativeObjectWrapper,
    comDotsunDotstarDotscriptDotScriptEvent: ScriptEvent,
    comDotsunDotstarDotscriptDotScriptEventDescriptor: ScriptEventDescriptor,
    comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent: VBAScriptEvent,
    comDotsunDotstarDotsdbDotDatabaseRegistrationEvent: DatabaseRegistrationEvent,
    comDotsunDotstarDotsdbDotRowChangeEvent: RowChangeEvent,
    comDotsunDotstarDotsdbDotRowsChangeEvent: RowsChangeEvent,
    comDotsunDotstarDotsdbDotSQLErrorEvent: SQLErrorEvent,
    comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent: CopyTableRowEvent,
    comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject: NamedDatabaseObject,
    comDotsunDotstarDotsdbcDotChangeEvent: ChangeEvent,
    comDotsunDotstarDotsdbcDotDriverPropertyInfo: DriverPropertyInfo,
    comDotsunDotstarDotsecurityDotAllPermission: AllPermission,
    comDotsunDotstarDotsecurityDotCertAltNameEntry: CertAltNameEntry,
    comDotsunDotstarDotsecurityDotDocumentSignatureInformation: DocumentSignatureInformation,
    comDotsunDotstarDotsecurityDotRuntimePermission: RuntimePermission,
    comDotsunDotstarDotsheetDotActivationEvent: ActivationEvent,
    comDotsunDotstarDotsheetDotComplexReference: ComplexReference,
    comDotsunDotstarDotsheetDotDDEItemInfo: DDEItemInfo,
    comDotsunDotstarDotsheetDotDDELinkInfo: DDELinkInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo: DataPilotFieldAutoShowInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldFilter: DataPilotFieldFilter,
    comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo: DataPilotFieldGroupInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo: DataPilotFieldLayoutInfo
  ): StructNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleEventObject")(comDotsunDotstarDotaccessibilityDotAccessibleEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleRelation")(comDotsunDotstarDotaccessibilityDotAccessibleRelation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleTableModelChange")(comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.TextSegment")(comDotsunDotstarDotaccessibilityDotTextSegment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.Event")(comDotsunDotstarDotanimationsDotEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.TargetProperties")(comDotsunDotstarDotanimationsDotTargetProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.TimeFilterPair")(comDotsunDotstarDotanimationsDotTimeFilterPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.ValuePair")(comDotsunDotstarDotanimationsDotValuePair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ActionEvent")(comDotsunDotstarDotawtDotActionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AdjustmentEvent")(comDotsunDotstarDotawtDotAdjustmentEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DeviceInfo")(comDotsunDotstarDotawtDotDeviceInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DockingData")(comDotsunDotstarDotawtDotDockingData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DockingEvent")(comDotsunDotstarDotawtDotDockingEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EndDockingEvent")(comDotsunDotstarDotawtDotEndDockingEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EndPopupModeEvent")(comDotsunDotstarDotawtDotEndPopupModeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EnhancedMouseEvent")(comDotsunDotstarDotawtDotEnhancedMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.FocusEvent")(comDotsunDotstarDotawtDotFocusEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.FontDescriptor")(comDotsunDotstarDotawtDotFontDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Gradient")(comDotsunDotstarDotawtDotGradient.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.InputEvent")(comDotsunDotstarDotawtDotInputEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ItemEvent")(comDotsunDotstarDotawtDotItemEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ItemListEvent")(comDotsunDotstarDotawtDotItemListEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.KeyEvent")(comDotsunDotstarDotawtDotKeyEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.KeyStroke")(comDotsunDotstarDotawtDotKeyStroke.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.MenuEvent")(comDotsunDotstarDotawtDotMenuEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.MouseEvent")(comDotsunDotstarDotawtDotMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.PaintEvent")(comDotsunDotstarDotawtDotPaintEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Point")(comDotsunDotstarDotawtDotPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Rectangle")(comDotsunDotstarDotawtDotRectangle.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Selection")(comDotsunDotstarDotawtDotSelection.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SimpleFontMetric")(comDotsunDotstarDotawtDotSimpleFontMetric.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Size")(comDotsunDotstarDotawtDotSize.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SpinEvent")(comDotsunDotstarDotawtDotSpinEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SystemDependentXWindow")(comDotsunDotstarDotawtDotSystemDependentXWindow.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.TextEvent")(comDotsunDotstarDotawtDotTextEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.VclContainerEvent")(comDotsunDotstarDotawtDotVclContainerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.WindowDescriptor")(comDotsunDotstarDotawtDotWindowDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.WindowEvent")(comDotsunDotstarDotawtDotWindowEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridColumnEvent")(comDotsunDotstarDotawtDotgridDotGridColumnEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridDataEvent")(comDotsunDotstarDotawtDotgridDotGridDataEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridSelectionEvent")(comDotsunDotstarDotawtDotgridDotGridSelectionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.TabPageActivatedEvent")(comDotsunDotstarDotawtDottabDotTabPageActivatedEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeDataModelEvent")(comDotsunDotstarDotawtDottreeDotTreeDataModelEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeExpansionEvent")(comDotsunDotstarDotawtDottreeDotTreeExpansionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.GetDirectPropertyTolerantResult")(comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.GetPropertyTolerantResult")(comDotsunDotstarDotbeansDotGetPropertyTolerantResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.NamedValue")(comDotsunDotstarDotbeansDotNamedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.Property")(comDotsunDotstarDotbeansDotProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyChangeEvent")(comDotsunDotstarDotbeansDotPropertyChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertySetInfoChangeEvent")(comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyStateChangeEvent")(comDotsunDotstarDotbeansDotPropertyStateChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyValue")(comDotsunDotstarDotbeansDotPropertyValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.SetPropertyTolerantFailed")(comDotsunDotstarDotbeansDotSetPropertyTolerantFailed.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.StringPair")(comDotsunDotstarDotbeansDotStringPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.ProtocolProperty")(comDotsunDotstarDotbridgeDotProtocolProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Currency")(comDotsunDotstarDotbridgeDotoleautomationDotCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Date")(comDotsunDotstarDotbridgeDotoleautomationDotDate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Decimal")(comDotsunDotstarDotbridgeDotoleautomationDotDecimal.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.NamedArgument")(comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.PropertyPutArgument")(comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.SCode")(comDotsunDotstarDotbridgeDotoleautomationDotSCode.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.DataPointLabel")(comDotsunDotstarDotchart2DotDataPointLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.FillBitmap")(comDotsunDotstarDotchart2DotFillBitmap.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.IncrementData")(comDotsunDotstarDotchart2DotIncrementData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.InterpretedData")(comDotsunDotstarDotchart2DotInterpretedData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LightSource")(comDotsunDotstarDotchart2DotLightSource.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RelativePosition")(comDotsunDotstarDotchart2DotRelativePosition.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RelativeSize")(comDotsunDotstarDotchart2DotRelativeSize.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ScaleData")(comDotsunDotstarDotchart2DotScaleData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.SubIncrement")(comDotsunDotstarDotchart2DotSubIncrement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Symbol")(comDotsunDotstarDotchart2DotSymbol.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.HighlightedRange")(comDotsunDotstarDotchart2DotdataDotHighlightedRange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataChangeEvent")(comDotsunDotstarDotchartDotChartDataChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataRow")(comDotsunDotstarDotchartDotChartDataRow.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataValue")(comDotsunDotstarDotchartDotChartDataValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartSeriesAddress")(comDotsunDotstarDotchartDotChartSeriesAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.TimeIncrement")(comDotsunDotstarDotchartDotTimeIncrement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.TimeInterval")(comDotsunDotstarDotchartDotTimeInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.ComponentChangeEvent")(comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.PropertyInfo")(comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.TemplateIdentifier")(comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.connection.SocketPermission")(comDotsunDotstarDotconnectionDotSocketPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.container.ContainerEvent")(comDotsunDotstarDotcontainerDotContainerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.DataFlavor")(comDotsunDotstarDotdatatransferDotDataFlavor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.clipboard.ClipboardEvent")(comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragGestureEvent")(comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDragEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDropEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEnterEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDropEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.deployment.UpdateInformationEntry")(comDotsunDotstarDotdeploymentDotUpdateInformationEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.CmisProperty")(comDotsunDotstarDotdocumentDotCmisProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.CmisVersion")(comDotsunDotstarDotdocumentDotCmisVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.DocumentEvent")(comDotsunDotstarDotdocumentDotDocumentEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.EventObject")(comDotsunDotstarDotdocumentDotEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.UndoManagerEvent")(comDotsunDotstarDotdocumentDotUndoManagerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.BezierPoint")(comDotsunDotstarDotdrawingDotBezierPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.BoundVolume")(comDotsunDotstarDotdrawingDotBoundVolume.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.CameraGeometry")(comDotsunDotstarDotdrawingDotCameraGeometry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Direction3D")(comDotsunDotstarDotdrawingDotDirection3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeAdjustmentValue")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameter")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameterPair")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeSegment")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeTextFrame")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.GluePoint")(comDotsunDotstarDotdrawingDotGluePoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.GluePoint2")(comDotsunDotstarDotdrawingDotGluePoint2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Hatch")(comDotsunDotstarDotdrawingDotHatch.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix")(comDotsunDotstarDotdrawingDotHomogenMatrix.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix3")(comDotsunDotstarDotdrawingDotHomogenMatrix3.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix4")(comDotsunDotstarDotdrawingDotHomogenMatrix4.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine")(comDotsunDotstarDotdrawingDotHomogenMatrixLine.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine3")(comDotsunDotstarDotdrawingDotHomogenMatrixLine3.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine4")(comDotsunDotstarDotdrawingDotHomogenMatrixLine4.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.LineDash")(comDotsunDotstarDotdrawingDotLineDash.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.PolyPolygonBezierCoords")(comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.PolyPolygonShape3D")(comDotsunDotstarDotdrawingDotPolyPolygonShape3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Position3D")(comDotsunDotstarDotdrawingDotPosition3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.framework.ConfigurationChangeEvent")(comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.framework.TabBarButton")(comDotsunDotstarDotdrawingDotframeworkDotTabBarButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.InsertedObjectInfo")(comDotsunDotstarDotembedDotInsertedObjectInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.VerbDescriptor")(comDotsunDotstarDotembedDotVerbDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.VisualRepresentation")(comDotsunDotstarDotembedDotVisualRepresentation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.DatabaseDeleteEvent")(comDotsunDotstarDotformDotDatabaseDeleteEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.DatabaseParameterEvent")(comDotsunDotstarDotformDotDatabaseParameterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.ErrorEvent")(comDotsunDotstarDotformDotErrorEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.binding.ListEntryEvent")(comDotsunDotstarDotformDotbindingDotListEntryEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.runtime.FeatureState")(comDotsunDotstarDotformDotruntimeDotFeatureState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.runtime.FilterEvent")(comDotsunDotstarDotformDotruntimeDotFilterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.formula.SymbolDescriptor")(comDotsunDotstarDotformulaDotSymbolDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.BorderWidths")(comDotsunDotstarDotframeDotBorderWidths.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.ControlCommand")(comDotsunDotstarDotframeDotControlCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.ControlEvent")(comDotsunDotstarDotframeDotControlEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchDescriptor")(comDotsunDotstarDotframeDotDispatchDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchInformation")(comDotsunDotstarDotframeDotDispatchInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchResultEvent")(comDotsunDotstarDotframeDotDispatchResultEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchStatement")(comDotsunDotstarDotframeDotDispatchStatement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.FeatureStateEvent")(comDotsunDotstarDotframeDotFeatureStateEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.FrameActionEvent")(comDotsunDotstarDotframeDotFrameActionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.TitleChangedEvent")(comDotsunDotstarDotframeDotTitleChangedEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.ClipboardFormats")(comDotsunDotstarDotframeDotstatusDotClipboardFormats.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.FontHeight")(comDotsunDotstarDotframeDotstatusDotFontHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.ItemStatus")(comDotsunDotstarDotframeDotstatusDotItemStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.LeftRightMargin")(comDotsunDotstarDotframeDotstatusDotLeftRightMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.LeftRightMarginScale")(comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Template")(comDotsunDotstarDotframeDotstatusDotTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.UpperLowerMargin")(comDotsunDotstarDotframeDotstatusDotUpperLowerMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.UpperLowerMarginScale")(comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Verb")(comDotsunDotstarDotframeDotstatusDotVerb.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Visibility")(comDotsunDotstarDotframeDotstatusDotVisibility.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.AffineMatrix2D")(comDotsunDotstarDotgeometryDotAffineMatrix2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.AffineMatrix3D")(comDotsunDotstarDotgeometryDotAffineMatrix3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.EllipticalArc")(comDotsunDotstarDotgeometryDotEllipticalArc.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerBezierSegment2D")(comDotsunDotstarDotgeometryDotIntegerBezierSegment2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerPoint2D")(comDotsunDotstarDotgeometryDotIntegerPoint2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerRectangle2D")(comDotsunDotstarDotgeometryDotIntegerRectangle2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerSize2D")(comDotsunDotstarDotgeometryDotIntegerSize2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.Matrix2D")(comDotsunDotstarDotgeometryDotMatrix2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealBezierSegment2D")(comDotsunDotstarDotgeometryDotRealBezierSegment2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealPoint2D")(comDotsunDotstarDotgeometryDotRealPoint2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealRectangle2D")(comDotsunDotstarDotgeometryDotRealRectangle2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealRectangle3D")(comDotsunDotstarDotgeometryDotRealRectangle3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealSize2D")(comDotsunDotstarDotgeometryDotRealSize2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Boundary")(comDotsunDotstarDoti18nDotBoundary.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Calendar")(comDotsunDotstarDoti18nDotCalendar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Calendar2")(comDotsunDotstarDoti18nDotCalendar2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.CalendarItem")(comDotsunDotstarDoti18nDotCalendarItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.CalendarItem2")(comDotsunDotstarDoti18nDotCalendarItem2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Currency")(comDotsunDotstarDoti18nDotCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Currency2")(comDotsunDotstarDoti18nDotCurrency2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.ForbiddenCharacters")(comDotsunDotstarDoti18nDotForbiddenCharacters.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.FormatElement")(comDotsunDotstarDoti18nDotFormatElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Implementation")(comDotsunDotstarDoti18nDotImplementation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LanguageCountryInfo")(comDotsunDotstarDoti18nDotLanguageCountryInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakHyphenationOptions")(comDotsunDotstarDoti18nDotLineBreakHyphenationOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakResults")(comDotsunDotstarDoti18nDotLineBreakResults.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakUserOptions")(comDotsunDotstarDoti18nDotLineBreakUserOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LocaleDataItem")(comDotsunDotstarDoti18nDotLocaleDataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.NativeNumberXmlAttributes")(comDotsunDotstarDoti18nDotNativeNumberXmlAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.NumberFormatCode")(comDotsunDotstarDoti18nDotNumberFormatCode.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.ParseResult")(comDotsunDotstarDoti18nDotParseResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.TextConversionResult")(comDotsunDotstarDoti18nDotTextConversionResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.inspection.LineDescriptor")(comDotsunDotstarDotinspectionDotLineDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.inspection.PropertyCategoryDescriptor")(comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.io.DataTransferEvent")(comDotsunDotstarDotioDotDataTransferEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.io.FilePermission")(comDotsunDotstarDotioDotFilePermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.lang.EventObject")(comDotsunDotstarDotlangDotEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.lang.Locale")(comDotsunDotstarDotlangDotLocale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.DictionaryEvent")(comDotsunDotstarDotlinguistic2DotDictionaryEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.DictionaryListEvent")(comDotsunDotstarDotlinguistic2DotDictionaryListEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.LinguServiceEvent")(comDotsunDotstarDotlinguistic2DotLinguServiceEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.ProofreadingResult")(comDotsunDotstarDotlinguistic2DotProofreadingResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.SingleProofreadingError")(comDotsunDotstarDotlinguistic2DotSingleProofreadingError.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.logging.LogRecord")(comDotsunDotstarDotloggingDotLogRecord.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mail.MailAttachment")(comDotsunDotstarDotmailDotMailAttachment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mozilla.MenuMultipleChange")(comDotsunDotstarDotmozillaDotMenuMultipleChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mozilla.MenuSingleChange")(comDotsunDotstarDotmozillaDotMenuSingleChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.packages.zip.ZipEntry")(comDotsunDotstarDotpackagesDotzipDotZipEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.presentation.ParagraphTarget")(comDotsunDotstarDotpresentationDotParagraphTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rdf.Statement")(comDotsunDotstarDotrdfDotStatement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.reflection.ParamInfo")(comDotsunDotstarDotreflectionDotParamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ARGBColor")(comDotsunDotstarDotrenderingDotARGBColor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.AnimationAttributes")(comDotsunDotstarDotrenderingDotAnimationAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Caret")(comDotsunDotstarDotrenderingDotCaret.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ColorProfile")(comDotsunDotstarDotrenderingDotColorProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FloatingPointBitmapLayout")(comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontInfo")(comDotsunDotstarDotrenderingDotFontInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontMetrics")(comDotsunDotstarDotrenderingDotFontMetrics.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontRequest")(comDotsunDotstarDotrenderingDotFontRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.IntegerBitmapLayout")(comDotsunDotstarDotrenderingDotIntegerBitmapLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Panose")(comDotsunDotstarDotrenderingDotPanose.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.RGBColor")(comDotsunDotstarDotrenderingDotRGBColor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.RenderState")(comDotsunDotstarDotrenderingDotRenderState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.StringContext")(comDotsunDotstarDotrenderingDotStringContext.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.StrokeAttributes")(comDotsunDotstarDotrenderingDotStrokeAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.TextHit")(comDotsunDotstarDotrenderingDotTextHit.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Texture")(comDotsunDotstarDotrenderingDotTexture.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ViewState")(comDotsunDotstarDotrenderingDotViewState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.scanner.ScannerContext")(comDotsunDotstarDotscannerDotScannerContext.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.AllEventObject")(comDotsunDotstarDotscriptDotAllEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ArrayWrapper")(comDotsunDotstarDotscriptDotArrayWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ContextInformation")(comDotsunDotstarDotscriptDotContextInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.EventListener")(comDotsunDotstarDotscriptDotEventListener.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.FinishEngineEvent")(comDotsunDotstarDotscriptDotFinishEngineEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.InterruptEngineEvent")(comDotsunDotstarDotscriptDotInterruptEngineEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.InvocationInfo")(comDotsunDotstarDotscriptDotInvocationInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ModuleInfo")(comDotsunDotstarDotscriptDotModuleInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.NativeObjectWrapper")(comDotsunDotstarDotscriptDotNativeObjectWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ScriptEvent")(comDotsunDotstarDotscriptDotScriptEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ScriptEventDescriptor")(comDotsunDotstarDotscriptDotScriptEventDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.vba.VBAScriptEvent")(comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.DatabaseRegistrationEvent")(comDotsunDotstarDotsdbDotDatabaseRegistrationEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.RowChangeEvent")(comDotsunDotstarDotsdbDotRowChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.RowsChangeEvent")(comDotsunDotstarDotsdbDotRowsChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.SQLErrorEvent")(comDotsunDotstarDotsdbDotSQLErrorEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.application.CopyTableRowEvent")(comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.application.NamedDatabaseObject")(comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdbc.ChangeEvent")(comDotsunDotstarDotsdbcDotChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdbc.DriverPropertyInfo")(comDotsunDotstarDotsdbcDotDriverPropertyInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.AllPermission")(comDotsunDotstarDotsecurityDotAllPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.CertAltNameEntry")(comDotsunDotstarDotsecurityDotCertAltNameEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.DocumentSignatureInformation")(comDotsunDotstarDotsecurityDotDocumentSignatureInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.RuntimePermission")(comDotsunDotstarDotsecurityDotRuntimePermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.ActivationEvent")(comDotsunDotstarDotsheetDotActivationEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.ComplexReference")(comDotsunDotstarDotsheetDotComplexReference.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DDEItemInfo")(comDotsunDotstarDotsheetDotDDEItemInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DDELinkInfo")(comDotsunDotstarDotsheetDotDDELinkInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldAutoShowInfo")(comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldFilter")(comDotsunDotstarDotsheetDotDataPilotFieldFilter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldGroupInfo")(comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldLayoutInfo")(comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructNameMap]
  }
}

