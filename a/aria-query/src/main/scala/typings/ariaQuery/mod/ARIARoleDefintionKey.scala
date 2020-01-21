package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ariaQuery.ariaQueryStrings.command
  - typings.ariaQuery.ariaQueryStrings.composite
  - typings.ariaQuery.ariaQueryStrings.input
  - typings.ariaQuery.ariaQueryStrings.landmark
  - typings.ariaQuery.ariaQueryStrings.range
  - typings.ariaQuery.ariaQueryStrings.roletype
  - typings.ariaQuery.ariaQueryStrings.section
  - typings.ariaQuery.ariaQueryStrings.sectionhead
  - typings.ariaQuery.ariaQueryStrings.select
  - typings.ariaQuery.ariaQueryStrings.structure
  - typings.ariaQuery.ariaQueryStrings.widget
  - typings.ariaQuery.ariaQueryStrings.window
  - typings.ariaQuery.ariaQueryStrings.alert
  - typings.ariaQuery.ariaQueryStrings.alertdialog
  - typings.ariaQuery.ariaQueryStrings.button
  - typings.ariaQuery.ariaQueryStrings.checkbox
  - typings.ariaQuery.ariaQueryStrings.dialog
  - typings.ariaQuery.ariaQueryStrings.gridcell
  - typings.ariaQuery.ariaQueryStrings.link
  - typings.ariaQuery.ariaQueryStrings.log
  - typings.ariaQuery.ariaQueryStrings.marquee
  - typings.ariaQuery.ariaQueryStrings.menuitem
  - typings.ariaQuery.ariaQueryStrings.menuitemcheckbox
  - typings.ariaQuery.ariaQueryStrings.menuitemradio
  - typings.ariaQuery.ariaQueryStrings.option
  - typings.ariaQuery.ariaQueryStrings.progressbar
  - typings.ariaQuery.ariaQueryStrings.radio
  - typings.ariaQuery.ariaQueryStrings.scrollbar
  - typings.ariaQuery.ariaQueryStrings.searchbox
  - typings.ariaQuery.ariaQueryStrings.slider
  - typings.ariaQuery.ariaQueryStrings.spinbutton
  - typings.ariaQuery.ariaQueryStrings.status
  - typings.ariaQuery.ariaQueryStrings.switch
  - typings.ariaQuery.ariaQueryStrings.tab
  - typings.ariaQuery.ariaQueryStrings.tabpanel
  - typings.ariaQuery.ariaQueryStrings.textbox
  - typings.ariaQuery.ariaQueryStrings.timer
  - typings.ariaQuery.ariaQueryStrings.tooltip
  - typings.ariaQuery.ariaQueryStrings.treeitem
  - typings.ariaQuery.ariaQueryStrings.combobox
  - typings.ariaQuery.ariaQueryStrings.grid
  - typings.ariaQuery.ariaQueryStrings.listbox
  - typings.ariaQuery.ariaQueryStrings.menu
  - typings.ariaQuery.ariaQueryStrings.menubar
  - typings.ariaQuery.ariaQueryStrings.radiogroup
  - typings.ariaQuery.ariaQueryStrings.tablist
  - typings.ariaQuery.ariaQueryStrings.tree
  - typings.ariaQuery.ariaQueryStrings.treegrid
  - typings.ariaQuery.ariaQueryStrings.article
  - typings.ariaQuery.ariaQueryStrings.cell
  - typings.ariaQuery.ariaQueryStrings.columnheader
  - typings.ariaQuery.ariaQueryStrings.definition
  - typings.ariaQuery.ariaQueryStrings.directory
  - typings.ariaQuery.ariaQueryStrings.document
  - typings.ariaQuery.ariaQueryStrings.feed
  - typings.ariaQuery.ariaQueryStrings.figure
  - typings.ariaQuery.ariaQueryStrings.group
  - typings.ariaQuery.ariaQueryStrings.heading
  - typings.ariaQuery.ariaQueryStrings.img
  - typings.ariaQuery.ariaQueryStrings.list
  - typings.ariaQuery.ariaQueryStrings.listitem
  - typings.ariaQuery.ariaQueryStrings.math
  - typings.ariaQuery.ariaQueryStrings.none
  - typings.ariaQuery.ariaQueryStrings.note
  - typings.ariaQuery.ariaQueryStrings.presentation
  - typings.ariaQuery.ariaQueryStrings.region
  - typings.ariaQuery.ariaQueryStrings.row
  - typings.ariaQuery.ariaQueryStrings.rowgroup
  - typings.ariaQuery.ariaQueryStrings.rowheader
  - typings.ariaQuery.ariaQueryStrings.separator
  - typings.ariaQuery.ariaQueryStrings.table
  - typings.ariaQuery.ariaQueryStrings.term
  - typings.ariaQuery.ariaQueryStrings.toolbar
  - typings.ariaQuery.ariaQueryStrings.application
  - typings.ariaQuery.ariaQueryStrings.banner
  - typings.ariaQuery.ariaQueryStrings.complementary
  - typings.ariaQuery.ariaQueryStrings.contentinfo
  - typings.ariaQuery.ariaQueryStrings.form
  - typings.ariaQuery.ariaQueryStrings.main
  - typings.ariaQuery.ariaQueryStrings.navigation
  - typings.ariaQuery.ariaQueryStrings.search
  - typings.ariaQuery.ariaQueryStrings.`doc-abstract`
  - typings.ariaQuery.ariaQueryStrings.`doc-acknowledgments`
  - typings.ariaQuery.ariaQueryStrings.`doc-afterword`
  - typings.ariaQuery.ariaQueryStrings.`doc-appendix`
  - typings.ariaQuery.ariaQueryStrings.`doc-backlink`
  - typings.ariaQuery.ariaQueryStrings.`doc-biblioentry`
  - typings.ariaQuery.ariaQueryStrings.`doc-bibliography`
  - typings.ariaQuery.ariaQueryStrings.`doc-biblioref`
  - typings.ariaQuery.ariaQueryStrings.`doc-chapter`
  - typings.ariaQuery.ariaQueryStrings.`doc-colophon`
  - typings.ariaQuery.ariaQueryStrings.`doc-conclusion`
  - typings.ariaQuery.ariaQueryStrings.`doc-cover`
  - typings.ariaQuery.ariaQueryStrings.`doc-credit`
  - typings.ariaQuery.ariaQueryStrings.`doc-credits`
  - typings.ariaQuery.ariaQueryStrings.`doc-dedication`
  - typings.ariaQuery.ariaQueryStrings.`doc-endnote`
  - typings.ariaQuery.ariaQueryStrings.`doc-endnotes`
  - typings.ariaQuery.ariaQueryStrings.`doc-epigraph`
  - typings.ariaQuery.ariaQueryStrings.`doc-epilogue`
  - typings.ariaQuery.ariaQueryStrings.`doc-errata`
  - typings.ariaQuery.ariaQueryStrings.`doc-example`
  - typings.ariaQuery.ariaQueryStrings.`doc-footnote`
  - typings.ariaQuery.ariaQueryStrings.`doc-foreword`
  - typings.ariaQuery.ariaQueryStrings.`doc-glossary`
  - typings.ariaQuery.ariaQueryStrings.`doc-glossref`
  - typings.ariaQuery.ariaQueryStrings.`doc-index`
  - typings.ariaQuery.ariaQueryStrings.`doc-introduction`
  - typings.ariaQuery.ariaQueryStrings.`doc-noteref`
  - typings.ariaQuery.ariaQueryStrings.`doc-notice`
  - typings.ariaQuery.ariaQueryStrings.`doc-pagebreak`
  - typings.ariaQuery.ariaQueryStrings.`doc-pagelist`
  - typings.ariaQuery.ariaQueryStrings.`doc-part`
  - typings.ariaQuery.ariaQueryStrings.`doc-preface`
  - typings.ariaQuery.ariaQueryStrings.`doc-prologue`
  - typings.ariaQuery.ariaQueryStrings.`doc-pullquote`
  - typings.ariaQuery.ariaQueryStrings.`doc-qna`
  - typings.ariaQuery.ariaQueryStrings.`doc-subtitle`
  - typings.ariaQuery.ariaQueryStrings.`doc-tip`
  - typings.ariaQuery.ariaQueryStrings.`doc-toc`
*/
trait ARIARoleDefintionKey extends js.Object

object ARIARoleDefintionKey {
  @scala.inline
  def alert: typings.ariaQuery.ariaQueryStrings.alert = this.cast("alert")
  @scala.inline
  def alertdialog: typings.ariaQuery.ariaQueryStrings.alertdialog = this.cast("alertdialog")
  @scala.inline
  def application: typings.ariaQuery.ariaQueryStrings.application = this.cast("application")
  @scala.inline
  def article: typings.ariaQuery.ariaQueryStrings.article = this.cast("article")
  @scala.inline
  def banner: typings.ariaQuery.ariaQueryStrings.banner = this.cast("banner")
  @scala.inline
  def button: typings.ariaQuery.ariaQueryStrings.button = this.cast("button")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typings.ariaQuery.ariaQueryStrings.cell = this.cast("cell")
  @scala.inline
  def checkbox: typings.ariaQuery.ariaQueryStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def columnheader: typings.ariaQuery.ariaQueryStrings.columnheader = this.cast("columnheader")
  @scala.inline
  def combobox: typings.ariaQuery.ariaQueryStrings.combobox = this.cast("combobox")
  @scala.inline
  def command: typings.ariaQuery.ariaQueryStrings.command = this.cast("command")
  @scala.inline
  def complementary: typings.ariaQuery.ariaQueryStrings.complementary = this.cast("complementary")
  @scala.inline
  def composite: typings.ariaQuery.ariaQueryStrings.composite = this.cast("composite")
  @scala.inline
  def contentinfo: typings.ariaQuery.ariaQueryStrings.contentinfo = this.cast("contentinfo")
  @scala.inline
  def definition: typings.ariaQuery.ariaQueryStrings.definition = this.cast("definition")
  @scala.inline
  def dialog: typings.ariaQuery.ariaQueryStrings.dialog = this.cast("dialog")
  @scala.inline
  def directory: typings.ariaQuery.ariaQueryStrings.directory = this.cast("directory")
  @scala.inline
  def `doc-abstract`: typings.ariaQuery.ariaQueryStrings.`doc-abstract` = this.cast("doc-abstract")
  @scala.inline
  def `doc-acknowledgments`: typings.ariaQuery.ariaQueryStrings.`doc-acknowledgments` = this.cast("doc-acknowledgments")
  @scala.inline
  def `doc-afterword`: typings.ariaQuery.ariaQueryStrings.`doc-afterword` = this.cast("doc-afterword")
  @scala.inline
  def `doc-appendix`: typings.ariaQuery.ariaQueryStrings.`doc-appendix` = this.cast("doc-appendix")
  @scala.inline
  def `doc-backlink`: typings.ariaQuery.ariaQueryStrings.`doc-backlink` = this.cast("doc-backlink")
  @scala.inline
  def `doc-biblioentry`: typings.ariaQuery.ariaQueryStrings.`doc-biblioentry` = this.cast("doc-biblioentry")
  @scala.inline
  def `doc-bibliography`: typings.ariaQuery.ariaQueryStrings.`doc-bibliography` = this.cast("doc-bibliography")
  @scala.inline
  def `doc-biblioref`: typings.ariaQuery.ariaQueryStrings.`doc-biblioref` = this.cast("doc-biblioref")
  @scala.inline
  def `doc-chapter`: typings.ariaQuery.ariaQueryStrings.`doc-chapter` = this.cast("doc-chapter")
  @scala.inline
  def `doc-colophon`: typings.ariaQuery.ariaQueryStrings.`doc-colophon` = this.cast("doc-colophon")
  @scala.inline
  def `doc-conclusion`: typings.ariaQuery.ariaQueryStrings.`doc-conclusion` = this.cast("doc-conclusion")
  @scala.inline
  def `doc-cover`: typings.ariaQuery.ariaQueryStrings.`doc-cover` = this.cast("doc-cover")
  @scala.inline
  def `doc-credit`: typings.ariaQuery.ariaQueryStrings.`doc-credit` = this.cast("doc-credit")
  @scala.inline
  def `doc-credits`: typings.ariaQuery.ariaQueryStrings.`doc-credits` = this.cast("doc-credits")
  @scala.inline
  def `doc-dedication`: typings.ariaQuery.ariaQueryStrings.`doc-dedication` = this.cast("doc-dedication")
  @scala.inline
  def `doc-endnote`: typings.ariaQuery.ariaQueryStrings.`doc-endnote` = this.cast("doc-endnote")
  @scala.inline
  def `doc-endnotes`: typings.ariaQuery.ariaQueryStrings.`doc-endnotes` = this.cast("doc-endnotes")
  @scala.inline
  def `doc-epigraph`: typings.ariaQuery.ariaQueryStrings.`doc-epigraph` = this.cast("doc-epigraph")
  @scala.inline
  def `doc-epilogue`: typings.ariaQuery.ariaQueryStrings.`doc-epilogue` = this.cast("doc-epilogue")
  @scala.inline
  def `doc-errata`: typings.ariaQuery.ariaQueryStrings.`doc-errata` = this.cast("doc-errata")
  @scala.inline
  def `doc-example`: typings.ariaQuery.ariaQueryStrings.`doc-example` = this.cast("doc-example")
  @scala.inline
  def `doc-footnote`: typings.ariaQuery.ariaQueryStrings.`doc-footnote` = this.cast("doc-footnote")
  @scala.inline
  def `doc-foreword`: typings.ariaQuery.ariaQueryStrings.`doc-foreword` = this.cast("doc-foreword")
  @scala.inline
  def `doc-glossary`: typings.ariaQuery.ariaQueryStrings.`doc-glossary` = this.cast("doc-glossary")
  @scala.inline
  def `doc-glossref`: typings.ariaQuery.ariaQueryStrings.`doc-glossref` = this.cast("doc-glossref")
  @scala.inline
  def `doc-index`: typings.ariaQuery.ariaQueryStrings.`doc-index` = this.cast("doc-index")
  @scala.inline
  def `doc-introduction`: typings.ariaQuery.ariaQueryStrings.`doc-introduction` = this.cast("doc-introduction")
  @scala.inline
  def `doc-noteref`: typings.ariaQuery.ariaQueryStrings.`doc-noteref` = this.cast("doc-noteref")
  @scala.inline
  def `doc-notice`: typings.ariaQuery.ariaQueryStrings.`doc-notice` = this.cast("doc-notice")
  @scala.inline
  def `doc-pagebreak`: typings.ariaQuery.ariaQueryStrings.`doc-pagebreak` = this.cast("doc-pagebreak")
  @scala.inline
  def `doc-pagelist`: typings.ariaQuery.ariaQueryStrings.`doc-pagelist` = this.cast("doc-pagelist")
  @scala.inline
  def `doc-part`: typings.ariaQuery.ariaQueryStrings.`doc-part` = this.cast("doc-part")
  @scala.inline
  def `doc-preface`: typings.ariaQuery.ariaQueryStrings.`doc-preface` = this.cast("doc-preface")
  @scala.inline
  def `doc-prologue`: typings.ariaQuery.ariaQueryStrings.`doc-prologue` = this.cast("doc-prologue")
  @scala.inline
  def `doc-pullquote`: typings.ariaQuery.ariaQueryStrings.`doc-pullquote` = this.cast("doc-pullquote")
  @scala.inline
  def `doc-qna`: typings.ariaQuery.ariaQueryStrings.`doc-qna` = this.cast("doc-qna")
  @scala.inline
  def `doc-subtitle`: typings.ariaQuery.ariaQueryStrings.`doc-subtitle` = this.cast("doc-subtitle")
  @scala.inline
  def `doc-tip`: typings.ariaQuery.ariaQueryStrings.`doc-tip` = this.cast("doc-tip")
  @scala.inline
  def `doc-toc`: typings.ariaQuery.ariaQueryStrings.`doc-toc` = this.cast("doc-toc")
  @scala.inline
  def document: typings.ariaQuery.ariaQueryStrings.document = this.cast("document")
  @scala.inline
  def feed: typings.ariaQuery.ariaQueryStrings.feed = this.cast("feed")
  @scala.inline
  def figure: typings.ariaQuery.ariaQueryStrings.figure = this.cast("figure")
  @scala.inline
  def form: typings.ariaQuery.ariaQueryStrings.form = this.cast("form")
  @scala.inline
  def grid: typings.ariaQuery.ariaQueryStrings.grid = this.cast("grid")
  @scala.inline
  def gridcell: typings.ariaQuery.ariaQueryStrings.gridcell = this.cast("gridcell")
  @scala.inline
  def group: typings.ariaQuery.ariaQueryStrings.group = this.cast("group")
  @scala.inline
  def heading: typings.ariaQuery.ariaQueryStrings.heading = this.cast("heading")
  @scala.inline
  def img: typings.ariaQuery.ariaQueryStrings.img = this.cast("img")
  @scala.inline
  def input: typings.ariaQuery.ariaQueryStrings.input = this.cast("input")
  @scala.inline
  def landmark: typings.ariaQuery.ariaQueryStrings.landmark = this.cast("landmark")
  @scala.inline
  def link: typings.ariaQuery.ariaQueryStrings.link = this.cast("link")
  @scala.inline
  def list: typings.ariaQuery.ariaQueryStrings.list = this.cast("list")
  @scala.inline
  def listbox: typings.ariaQuery.ariaQueryStrings.listbox = this.cast("listbox")
  @scala.inline
  def listitem: typings.ariaQuery.ariaQueryStrings.listitem = this.cast("listitem")
  @scala.inline
  def log: typings.ariaQuery.ariaQueryStrings.log = this.cast("log")
  @scala.inline
  def main: typings.ariaQuery.ariaQueryStrings.main = this.cast("main")
  @scala.inline
  def marquee: typings.ariaQuery.ariaQueryStrings.marquee = this.cast("marquee")
  @scala.inline
  def math: typings.ariaQuery.ariaQueryStrings.math = this.cast("math")
  @scala.inline
  def menu: typings.ariaQuery.ariaQueryStrings.menu = this.cast("menu")
  @scala.inline
  def menubar: typings.ariaQuery.ariaQueryStrings.menubar = this.cast("menubar")
  @scala.inline
  def menuitem: typings.ariaQuery.ariaQueryStrings.menuitem = this.cast("menuitem")
  @scala.inline
  def menuitemcheckbox: typings.ariaQuery.ariaQueryStrings.menuitemcheckbox = this.cast("menuitemcheckbox")
  @scala.inline
  def menuitemradio: typings.ariaQuery.ariaQueryStrings.menuitemradio = this.cast("menuitemradio")
  @scala.inline
  def navigation: typings.ariaQuery.ariaQueryStrings.navigation = this.cast("navigation")
  @scala.inline
  def none: typings.ariaQuery.ariaQueryStrings.none = this.cast("none")
  @scala.inline
  def note: typings.ariaQuery.ariaQueryStrings.note = this.cast("note")
  @scala.inline
  def option: typings.ariaQuery.ariaQueryStrings.option = this.cast("option")
  @scala.inline
  def presentation: typings.ariaQuery.ariaQueryStrings.presentation = this.cast("presentation")
  @scala.inline
  def progressbar: typings.ariaQuery.ariaQueryStrings.progressbar = this.cast("progressbar")
  @scala.inline
  def radio: typings.ariaQuery.ariaQueryStrings.radio = this.cast("radio")
  @scala.inline
  def radiogroup: typings.ariaQuery.ariaQueryStrings.radiogroup = this.cast("radiogroup")
  @scala.inline
  def range: typings.ariaQuery.ariaQueryStrings.range = this.cast("range")
  @scala.inline
  def region: typings.ariaQuery.ariaQueryStrings.region = this.cast("region")
  @scala.inline
  def roletype: typings.ariaQuery.ariaQueryStrings.roletype = this.cast("roletype")
  @scala.inline
  def row: typings.ariaQuery.ariaQueryStrings.row = this.cast("row")
  @scala.inline
  def rowgroup: typings.ariaQuery.ariaQueryStrings.rowgroup = this.cast("rowgroup")
  @scala.inline
  def rowheader: typings.ariaQuery.ariaQueryStrings.rowheader = this.cast("rowheader")
  @scala.inline
  def scrollbar: typings.ariaQuery.ariaQueryStrings.scrollbar = this.cast("scrollbar")
  @scala.inline
  def search: typings.ariaQuery.ariaQueryStrings.search = this.cast("search")
  @scala.inline
  def searchbox: typings.ariaQuery.ariaQueryStrings.searchbox = this.cast("searchbox")
  @scala.inline
  def section: typings.ariaQuery.ariaQueryStrings.section = this.cast("section")
  @scala.inline
  def sectionhead: typings.ariaQuery.ariaQueryStrings.sectionhead = this.cast("sectionhead")
  @scala.inline
  def select: typings.ariaQuery.ariaQueryStrings.select = this.cast("select")
  @scala.inline
  def separator: typings.ariaQuery.ariaQueryStrings.separator = this.cast("separator")
  @scala.inline
  def slider: typings.ariaQuery.ariaQueryStrings.slider = this.cast("slider")
  @scala.inline
  def spinbutton: typings.ariaQuery.ariaQueryStrings.spinbutton = this.cast("spinbutton")
  @scala.inline
  def status: typings.ariaQuery.ariaQueryStrings.status = this.cast("status")
  @scala.inline
  def structure: typings.ariaQuery.ariaQueryStrings.structure = this.cast("structure")
  @scala.inline
  def switch: typings.ariaQuery.ariaQueryStrings.switch = this.cast("switch")
  @scala.inline
  def tab: typings.ariaQuery.ariaQueryStrings.tab = this.cast("tab")
  @scala.inline
  def table: typings.ariaQuery.ariaQueryStrings.table = this.cast("table")
  @scala.inline
  def tablist: typings.ariaQuery.ariaQueryStrings.tablist = this.cast("tablist")
  @scala.inline
  def tabpanel: typings.ariaQuery.ariaQueryStrings.tabpanel = this.cast("tabpanel")
  @scala.inline
  def term: typings.ariaQuery.ariaQueryStrings.term = this.cast("term")
  @scala.inline
  def textbox: typings.ariaQuery.ariaQueryStrings.textbox = this.cast("textbox")
  @scala.inline
  def timer: typings.ariaQuery.ariaQueryStrings.timer = this.cast("timer")
  @scala.inline
  def toolbar: typings.ariaQuery.ariaQueryStrings.toolbar = this.cast("toolbar")
  @scala.inline
  def tooltip: typings.ariaQuery.ariaQueryStrings.tooltip = this.cast("tooltip")
  @scala.inline
  def tree: typings.ariaQuery.ariaQueryStrings.tree = this.cast("tree")
  @scala.inline
  def treegrid: typings.ariaQuery.ariaQueryStrings.treegrid = this.cast("treegrid")
  @scala.inline
  def treeitem: typings.ariaQuery.ariaQueryStrings.treeitem = this.cast("treeitem")
  @scala.inline
  def widget: typings.ariaQuery.ariaQueryStrings.widget = this.cast("widget")
  @scala.inline
  def window: typings.ariaQuery.ariaQueryStrings.window = this.cast("window")
}

