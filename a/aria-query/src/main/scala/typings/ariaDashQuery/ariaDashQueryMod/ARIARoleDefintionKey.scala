package typings.ariaDashQuery.ariaDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ariaDashQuery.ariaDashQueryStrings.command
  - typings.ariaDashQuery.ariaDashQueryStrings.composite
  - typings.ariaDashQuery.ariaDashQueryStrings.input
  - typings.ariaDashQuery.ariaDashQueryStrings.landmark
  - typings.ariaDashQuery.ariaDashQueryStrings.range
  - typings.ariaDashQuery.ariaDashQueryStrings.roletype
  - typings.ariaDashQuery.ariaDashQueryStrings.section
  - typings.ariaDashQuery.ariaDashQueryStrings.sectionhead
  - typings.ariaDashQuery.ariaDashQueryStrings.select
  - typings.ariaDashQuery.ariaDashQueryStrings.structure
  - typings.ariaDashQuery.ariaDashQueryStrings.widget
  - typings.ariaDashQuery.ariaDashQueryStrings.window
  - typings.ariaDashQuery.ariaDashQueryStrings.alert
  - typings.ariaDashQuery.ariaDashQueryStrings.alertdialog
  - typings.ariaDashQuery.ariaDashQueryStrings.button
  - typings.ariaDashQuery.ariaDashQueryStrings.checkbox
  - typings.ariaDashQuery.ariaDashQueryStrings.dialog
  - typings.ariaDashQuery.ariaDashQueryStrings.gridcell
  - typings.ariaDashQuery.ariaDashQueryStrings.link
  - typings.ariaDashQuery.ariaDashQueryStrings.log
  - typings.ariaDashQuery.ariaDashQueryStrings.marquee
  - typings.ariaDashQuery.ariaDashQueryStrings.menuitem
  - typings.ariaDashQuery.ariaDashQueryStrings.menuitemcheckbox
  - typings.ariaDashQuery.ariaDashQueryStrings.menuitemradio
  - typings.ariaDashQuery.ariaDashQueryStrings.option
  - typings.ariaDashQuery.ariaDashQueryStrings.progressbar
  - typings.ariaDashQuery.ariaDashQueryStrings.radio
  - typings.ariaDashQuery.ariaDashQueryStrings.scrollbar
  - typings.ariaDashQuery.ariaDashQueryStrings.searchbox
  - typings.ariaDashQuery.ariaDashQueryStrings.slider
  - typings.ariaDashQuery.ariaDashQueryStrings.spinbutton
  - typings.ariaDashQuery.ariaDashQueryStrings.status
  - typings.ariaDashQuery.ariaDashQueryStrings.switch
  - typings.ariaDashQuery.ariaDashQueryStrings.tab
  - typings.ariaDashQuery.ariaDashQueryStrings.tabpanel
  - typings.ariaDashQuery.ariaDashQueryStrings.textbox
  - typings.ariaDashQuery.ariaDashQueryStrings.timer
  - typings.ariaDashQuery.ariaDashQueryStrings.tooltip
  - typings.ariaDashQuery.ariaDashQueryStrings.treeitem
  - typings.ariaDashQuery.ariaDashQueryStrings.combobox
  - typings.ariaDashQuery.ariaDashQueryStrings.grid
  - typings.ariaDashQuery.ariaDashQueryStrings.listbox
  - typings.ariaDashQuery.ariaDashQueryStrings.menu
  - typings.ariaDashQuery.ariaDashQueryStrings.menubar
  - typings.ariaDashQuery.ariaDashQueryStrings.radiogroup
  - typings.ariaDashQuery.ariaDashQueryStrings.tablist
  - typings.ariaDashQuery.ariaDashQueryStrings.tree
  - typings.ariaDashQuery.ariaDashQueryStrings.treegrid
  - typings.ariaDashQuery.ariaDashQueryStrings.article
  - typings.ariaDashQuery.ariaDashQueryStrings.cell
  - typings.ariaDashQuery.ariaDashQueryStrings.columnheader
  - typings.ariaDashQuery.ariaDashQueryStrings.definition
  - typings.ariaDashQuery.ariaDashQueryStrings.directory
  - typings.ariaDashQuery.ariaDashQueryStrings.document
  - typings.ariaDashQuery.ariaDashQueryStrings.feed
  - typings.ariaDashQuery.ariaDashQueryStrings.figure
  - typings.ariaDashQuery.ariaDashQueryStrings.group
  - typings.ariaDashQuery.ariaDashQueryStrings.heading
  - typings.ariaDashQuery.ariaDashQueryStrings.img
  - typings.ariaDashQuery.ariaDashQueryStrings.list
  - typings.ariaDashQuery.ariaDashQueryStrings.listitem
  - typings.ariaDashQuery.ariaDashQueryStrings.math
  - typings.ariaDashQuery.ariaDashQueryStrings.none
  - typings.ariaDashQuery.ariaDashQueryStrings.note
  - typings.ariaDashQuery.ariaDashQueryStrings.presentation
  - typings.ariaDashQuery.ariaDashQueryStrings.region
  - typings.ariaDashQuery.ariaDashQueryStrings.row
  - typings.ariaDashQuery.ariaDashQueryStrings.rowgroup
  - typings.ariaDashQuery.ariaDashQueryStrings.rowheader
  - typings.ariaDashQuery.ariaDashQueryStrings.separator
  - typings.ariaDashQuery.ariaDashQueryStrings.table
  - typings.ariaDashQuery.ariaDashQueryStrings.term
  - typings.ariaDashQuery.ariaDashQueryStrings.toolbar
  - typings.ariaDashQuery.ariaDashQueryStrings.application
  - typings.ariaDashQuery.ariaDashQueryStrings.banner
  - typings.ariaDashQuery.ariaDashQueryStrings.complementary
  - typings.ariaDashQuery.ariaDashQueryStrings.contentinfo
  - typings.ariaDashQuery.ariaDashQueryStrings.form
  - typings.ariaDashQuery.ariaDashQueryStrings.main
  - typings.ariaDashQuery.ariaDashQueryStrings.navigation
  - typings.ariaDashQuery.ariaDashQueryStrings.search
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-abstract`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-acknowledgments`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-afterword`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-appendix`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-backlink`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-biblioentry`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-bibliography`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-biblioref`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-chapter`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-colophon`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-conclusion`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-cover`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-credit`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-credits`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-dedication`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-endnote`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-endnotes`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-epigraph`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-epilogue`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-errata`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-example`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-footnote`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-foreword`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-glossary`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-glossref`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-index`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-introduction`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-noteref`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-notice`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-pagebreak`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-pagelist`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-part`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-preface`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-prologue`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-pullquote`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-qna`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-subtitle`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-tip`
  - typings.ariaDashQuery.ariaDashQueryStrings.`doc-toc`
*/
trait ARIARoleDefintionKey extends js.Object

object ARIARoleDefintionKey {
  @scala.inline
  def alert: typings.ariaDashQuery.ariaDashQueryStrings.alert = this.cast("alert")
  @scala.inline
  def alertdialog: typings.ariaDashQuery.ariaDashQueryStrings.alertdialog = this.cast("alertdialog")
  @scala.inline
  def application: typings.ariaDashQuery.ariaDashQueryStrings.application = this.cast("application")
  @scala.inline
  def article: typings.ariaDashQuery.ariaDashQueryStrings.article = this.cast("article")
  @scala.inline
  def banner: typings.ariaDashQuery.ariaDashQueryStrings.banner = this.cast("banner")
  @scala.inline
  def button: typings.ariaDashQuery.ariaDashQueryStrings.button = this.cast("button")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typings.ariaDashQuery.ariaDashQueryStrings.cell = this.cast("cell")
  @scala.inline
  def checkbox: typings.ariaDashQuery.ariaDashQueryStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def columnheader: typings.ariaDashQuery.ariaDashQueryStrings.columnheader = this.cast("columnheader")
  @scala.inline
  def combobox: typings.ariaDashQuery.ariaDashQueryStrings.combobox = this.cast("combobox")
  @scala.inline
  def command: typings.ariaDashQuery.ariaDashQueryStrings.command = this.cast("command")
  @scala.inline
  def complementary: typings.ariaDashQuery.ariaDashQueryStrings.complementary = this.cast("complementary")
  @scala.inline
  def composite: typings.ariaDashQuery.ariaDashQueryStrings.composite = this.cast("composite")
  @scala.inline
  def contentinfo: typings.ariaDashQuery.ariaDashQueryStrings.contentinfo = this.cast("contentinfo")
  @scala.inline
  def definition: typings.ariaDashQuery.ariaDashQueryStrings.definition = this.cast("definition")
  @scala.inline
  def dialog: typings.ariaDashQuery.ariaDashQueryStrings.dialog = this.cast("dialog")
  @scala.inline
  def directory: typings.ariaDashQuery.ariaDashQueryStrings.directory = this.cast("directory")
  @scala.inline
  def `doc-abstract`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-abstract` = this.cast("doc-abstract")
  @scala.inline
  def `doc-acknowledgments`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-acknowledgments` = this.cast("doc-acknowledgments")
  @scala.inline
  def `doc-afterword`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-afterword` = this.cast("doc-afterword")
  @scala.inline
  def `doc-appendix`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-appendix` = this.cast("doc-appendix")
  @scala.inline
  def `doc-backlink`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-backlink` = this.cast("doc-backlink")
  @scala.inline
  def `doc-biblioentry`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-biblioentry` = this.cast("doc-biblioentry")
  @scala.inline
  def `doc-bibliography`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-bibliography` = this.cast("doc-bibliography")
  @scala.inline
  def `doc-biblioref`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-biblioref` = this.cast("doc-biblioref")
  @scala.inline
  def `doc-chapter`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-chapter` = this.cast("doc-chapter")
  @scala.inline
  def `doc-colophon`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-colophon` = this.cast("doc-colophon")
  @scala.inline
  def `doc-conclusion`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-conclusion` = this.cast("doc-conclusion")
  @scala.inline
  def `doc-cover`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-cover` = this.cast("doc-cover")
  @scala.inline
  def `doc-credit`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-credit` = this.cast("doc-credit")
  @scala.inline
  def `doc-credits`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-credits` = this.cast("doc-credits")
  @scala.inline
  def `doc-dedication`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-dedication` = this.cast("doc-dedication")
  @scala.inline
  def `doc-endnote`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-endnote` = this.cast("doc-endnote")
  @scala.inline
  def `doc-endnotes`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-endnotes` = this.cast("doc-endnotes")
  @scala.inline
  def `doc-epigraph`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-epigraph` = this.cast("doc-epigraph")
  @scala.inline
  def `doc-epilogue`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-epilogue` = this.cast("doc-epilogue")
  @scala.inline
  def `doc-errata`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-errata` = this.cast("doc-errata")
  @scala.inline
  def `doc-example`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-example` = this.cast("doc-example")
  @scala.inline
  def `doc-footnote`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-footnote` = this.cast("doc-footnote")
  @scala.inline
  def `doc-foreword`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-foreword` = this.cast("doc-foreword")
  @scala.inline
  def `doc-glossary`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-glossary` = this.cast("doc-glossary")
  @scala.inline
  def `doc-glossref`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-glossref` = this.cast("doc-glossref")
  @scala.inline
  def `doc-index`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-index` = this.cast("doc-index")
  @scala.inline
  def `doc-introduction`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-introduction` = this.cast("doc-introduction")
  @scala.inline
  def `doc-noteref`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-noteref` = this.cast("doc-noteref")
  @scala.inline
  def `doc-notice`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-notice` = this.cast("doc-notice")
  @scala.inline
  def `doc-pagebreak`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-pagebreak` = this.cast("doc-pagebreak")
  @scala.inline
  def `doc-pagelist`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-pagelist` = this.cast("doc-pagelist")
  @scala.inline
  def `doc-part`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-part` = this.cast("doc-part")
  @scala.inline
  def `doc-preface`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-preface` = this.cast("doc-preface")
  @scala.inline
  def `doc-prologue`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-prologue` = this.cast("doc-prologue")
  @scala.inline
  def `doc-pullquote`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-pullquote` = this.cast("doc-pullquote")
  @scala.inline
  def `doc-qna`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-qna` = this.cast("doc-qna")
  @scala.inline
  def `doc-subtitle`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-subtitle` = this.cast("doc-subtitle")
  @scala.inline
  def `doc-tip`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-tip` = this.cast("doc-tip")
  @scala.inline
  def `doc-toc`: typings.ariaDashQuery.ariaDashQueryStrings.`doc-toc` = this.cast("doc-toc")
  @scala.inline
  def document: typings.ariaDashQuery.ariaDashQueryStrings.document = this.cast("document")
  @scala.inline
  def feed: typings.ariaDashQuery.ariaDashQueryStrings.feed = this.cast("feed")
  @scala.inline
  def figure: typings.ariaDashQuery.ariaDashQueryStrings.figure = this.cast("figure")
  @scala.inline
  def form: typings.ariaDashQuery.ariaDashQueryStrings.form = this.cast("form")
  @scala.inline
  def grid: typings.ariaDashQuery.ariaDashQueryStrings.grid = this.cast("grid")
  @scala.inline
  def gridcell: typings.ariaDashQuery.ariaDashQueryStrings.gridcell = this.cast("gridcell")
  @scala.inline
  def group: typings.ariaDashQuery.ariaDashQueryStrings.group = this.cast("group")
  @scala.inline
  def heading: typings.ariaDashQuery.ariaDashQueryStrings.heading = this.cast("heading")
  @scala.inline
  def img: typings.ariaDashQuery.ariaDashQueryStrings.img = this.cast("img")
  @scala.inline
  def input: typings.ariaDashQuery.ariaDashQueryStrings.input = this.cast("input")
  @scala.inline
  def landmark: typings.ariaDashQuery.ariaDashQueryStrings.landmark = this.cast("landmark")
  @scala.inline
  def link: typings.ariaDashQuery.ariaDashQueryStrings.link = this.cast("link")
  @scala.inline
  def list: typings.ariaDashQuery.ariaDashQueryStrings.list = this.cast("list")
  @scala.inline
  def listbox: typings.ariaDashQuery.ariaDashQueryStrings.listbox = this.cast("listbox")
  @scala.inline
  def listitem: typings.ariaDashQuery.ariaDashQueryStrings.listitem = this.cast("listitem")
  @scala.inline
  def log: typings.ariaDashQuery.ariaDashQueryStrings.log = this.cast("log")
  @scala.inline
  def main: typings.ariaDashQuery.ariaDashQueryStrings.main = this.cast("main")
  @scala.inline
  def marquee: typings.ariaDashQuery.ariaDashQueryStrings.marquee = this.cast("marquee")
  @scala.inline
  def math: typings.ariaDashQuery.ariaDashQueryStrings.math = this.cast("math")
  @scala.inline
  def menu: typings.ariaDashQuery.ariaDashQueryStrings.menu = this.cast("menu")
  @scala.inline
  def menubar: typings.ariaDashQuery.ariaDashQueryStrings.menubar = this.cast("menubar")
  @scala.inline
  def menuitem: typings.ariaDashQuery.ariaDashQueryStrings.menuitem = this.cast("menuitem")
  @scala.inline
  def menuitemcheckbox: typings.ariaDashQuery.ariaDashQueryStrings.menuitemcheckbox = this.cast("menuitemcheckbox")
  @scala.inline
  def menuitemradio: typings.ariaDashQuery.ariaDashQueryStrings.menuitemradio = this.cast("menuitemradio")
  @scala.inline
  def navigation: typings.ariaDashQuery.ariaDashQueryStrings.navigation = this.cast("navigation")
  @scala.inline
  def none: typings.ariaDashQuery.ariaDashQueryStrings.none = this.cast("none")
  @scala.inline
  def note: typings.ariaDashQuery.ariaDashQueryStrings.note = this.cast("note")
  @scala.inline
  def option: typings.ariaDashQuery.ariaDashQueryStrings.option = this.cast("option")
  @scala.inline
  def presentation: typings.ariaDashQuery.ariaDashQueryStrings.presentation = this.cast("presentation")
  @scala.inline
  def progressbar: typings.ariaDashQuery.ariaDashQueryStrings.progressbar = this.cast("progressbar")
  @scala.inline
  def radio: typings.ariaDashQuery.ariaDashQueryStrings.radio = this.cast("radio")
  @scala.inline
  def radiogroup: typings.ariaDashQuery.ariaDashQueryStrings.radiogroup = this.cast("radiogroup")
  @scala.inline
  def range: typings.ariaDashQuery.ariaDashQueryStrings.range = this.cast("range")
  @scala.inline
  def region: typings.ariaDashQuery.ariaDashQueryStrings.region = this.cast("region")
  @scala.inline
  def roletype: typings.ariaDashQuery.ariaDashQueryStrings.roletype = this.cast("roletype")
  @scala.inline
  def row: typings.ariaDashQuery.ariaDashQueryStrings.row = this.cast("row")
  @scala.inline
  def rowgroup: typings.ariaDashQuery.ariaDashQueryStrings.rowgroup = this.cast("rowgroup")
  @scala.inline
  def rowheader: typings.ariaDashQuery.ariaDashQueryStrings.rowheader = this.cast("rowheader")
  @scala.inline
  def scrollbar: typings.ariaDashQuery.ariaDashQueryStrings.scrollbar = this.cast("scrollbar")
  @scala.inline
  def search: typings.ariaDashQuery.ariaDashQueryStrings.search = this.cast("search")
  @scala.inline
  def searchbox: typings.ariaDashQuery.ariaDashQueryStrings.searchbox = this.cast("searchbox")
  @scala.inline
  def section: typings.ariaDashQuery.ariaDashQueryStrings.section = this.cast("section")
  @scala.inline
  def sectionhead: typings.ariaDashQuery.ariaDashQueryStrings.sectionhead = this.cast("sectionhead")
  @scala.inline
  def select: typings.ariaDashQuery.ariaDashQueryStrings.select = this.cast("select")
  @scala.inline
  def separator: typings.ariaDashQuery.ariaDashQueryStrings.separator = this.cast("separator")
  @scala.inline
  def slider: typings.ariaDashQuery.ariaDashQueryStrings.slider = this.cast("slider")
  @scala.inline
  def spinbutton: typings.ariaDashQuery.ariaDashQueryStrings.spinbutton = this.cast("spinbutton")
  @scala.inline
  def status: typings.ariaDashQuery.ariaDashQueryStrings.status = this.cast("status")
  @scala.inline
  def structure: typings.ariaDashQuery.ariaDashQueryStrings.structure = this.cast("structure")
  @scala.inline
  def switch: typings.ariaDashQuery.ariaDashQueryStrings.switch = this.cast("switch")
  @scala.inline
  def tab: typings.ariaDashQuery.ariaDashQueryStrings.tab = this.cast("tab")
  @scala.inline
  def table: typings.ariaDashQuery.ariaDashQueryStrings.table = this.cast("table")
  @scala.inline
  def tablist: typings.ariaDashQuery.ariaDashQueryStrings.tablist = this.cast("tablist")
  @scala.inline
  def tabpanel: typings.ariaDashQuery.ariaDashQueryStrings.tabpanel = this.cast("tabpanel")
  @scala.inline
  def term: typings.ariaDashQuery.ariaDashQueryStrings.term = this.cast("term")
  @scala.inline
  def textbox: typings.ariaDashQuery.ariaDashQueryStrings.textbox = this.cast("textbox")
  @scala.inline
  def timer: typings.ariaDashQuery.ariaDashQueryStrings.timer = this.cast("timer")
  @scala.inline
  def toolbar: typings.ariaDashQuery.ariaDashQueryStrings.toolbar = this.cast("toolbar")
  @scala.inline
  def tooltip: typings.ariaDashQuery.ariaDashQueryStrings.tooltip = this.cast("tooltip")
  @scala.inline
  def tree: typings.ariaDashQuery.ariaDashQueryStrings.tree = this.cast("tree")
  @scala.inline
  def treegrid: typings.ariaDashQuery.ariaDashQueryStrings.treegrid = this.cast("treegrid")
  @scala.inline
  def treeitem: typings.ariaDashQuery.ariaDashQueryStrings.treeitem = this.cast("treeitem")
  @scala.inline
  def widget: typings.ariaDashQuery.ariaDashQueryStrings.widget = this.cast("widget")
  @scala.inline
  def window: typings.ariaDashQuery.ariaDashQueryStrings.window = this.cast("window")
}

