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
  def alert: typings.ariaQuery.ariaQueryStrings.alert = "alert".asInstanceOf[typings.ariaQuery.ariaQueryStrings.alert]
  @scala.inline
  def alertdialog: typings.ariaQuery.ariaQueryStrings.alertdialog = "alertdialog".asInstanceOf[typings.ariaQuery.ariaQueryStrings.alertdialog]
  @scala.inline
  def application: typings.ariaQuery.ariaQueryStrings.application = "application".asInstanceOf[typings.ariaQuery.ariaQueryStrings.application]
  @scala.inline
  def article: typings.ariaQuery.ariaQueryStrings.article = "article".asInstanceOf[typings.ariaQuery.ariaQueryStrings.article]
  @scala.inline
  def banner: typings.ariaQuery.ariaQueryStrings.banner = "banner".asInstanceOf[typings.ariaQuery.ariaQueryStrings.banner]
  @scala.inline
  def button: typings.ariaQuery.ariaQueryStrings.button = "button".asInstanceOf[typings.ariaQuery.ariaQueryStrings.button]
  @scala.inline
  def cell: typings.ariaQuery.ariaQueryStrings.cell = "cell".asInstanceOf[typings.ariaQuery.ariaQueryStrings.cell]
  @scala.inline
  def checkbox: typings.ariaQuery.ariaQueryStrings.checkbox = "checkbox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.checkbox]
  @scala.inline
  def columnheader: typings.ariaQuery.ariaQueryStrings.columnheader = "columnheader".asInstanceOf[typings.ariaQuery.ariaQueryStrings.columnheader]
  @scala.inline
  def combobox: typings.ariaQuery.ariaQueryStrings.combobox = "combobox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.combobox]
  @scala.inline
  def command: typings.ariaQuery.ariaQueryStrings.command = "command".asInstanceOf[typings.ariaQuery.ariaQueryStrings.command]
  @scala.inline
  def complementary: typings.ariaQuery.ariaQueryStrings.complementary = "complementary".asInstanceOf[typings.ariaQuery.ariaQueryStrings.complementary]
  @scala.inline
  def composite: typings.ariaQuery.ariaQueryStrings.composite = "composite".asInstanceOf[typings.ariaQuery.ariaQueryStrings.composite]
  @scala.inline
  def contentinfo: typings.ariaQuery.ariaQueryStrings.contentinfo = "contentinfo".asInstanceOf[typings.ariaQuery.ariaQueryStrings.contentinfo]
  @scala.inline
  def definition: typings.ariaQuery.ariaQueryStrings.definition = "definition".asInstanceOf[typings.ariaQuery.ariaQueryStrings.definition]
  @scala.inline
  def dialog: typings.ariaQuery.ariaQueryStrings.dialog = "dialog".asInstanceOf[typings.ariaQuery.ariaQueryStrings.dialog]
  @scala.inline
  def directory: typings.ariaQuery.ariaQueryStrings.directory = "directory".asInstanceOf[typings.ariaQuery.ariaQueryStrings.directory]
  @scala.inline
  def `doc-abstract`: typings.ariaQuery.ariaQueryStrings.`doc-abstract` = "doc-abstract".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-abstract`]
  @scala.inline
  def `doc-acknowledgments`: typings.ariaQuery.ariaQueryStrings.`doc-acknowledgments` = "doc-acknowledgments".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-acknowledgments`]
  @scala.inline
  def `doc-afterword`: typings.ariaQuery.ariaQueryStrings.`doc-afterword` = "doc-afterword".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-afterword`]
  @scala.inline
  def `doc-appendix`: typings.ariaQuery.ariaQueryStrings.`doc-appendix` = "doc-appendix".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-appendix`]
  @scala.inline
  def `doc-backlink`: typings.ariaQuery.ariaQueryStrings.`doc-backlink` = "doc-backlink".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-backlink`]
  @scala.inline
  def `doc-biblioentry`: typings.ariaQuery.ariaQueryStrings.`doc-biblioentry` = "doc-biblioentry".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-biblioentry`]
  @scala.inline
  def `doc-bibliography`: typings.ariaQuery.ariaQueryStrings.`doc-bibliography` = "doc-bibliography".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-bibliography`]
  @scala.inline
  def `doc-biblioref`: typings.ariaQuery.ariaQueryStrings.`doc-biblioref` = "doc-biblioref".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-biblioref`]
  @scala.inline
  def `doc-chapter`: typings.ariaQuery.ariaQueryStrings.`doc-chapter` = "doc-chapter".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-chapter`]
  @scala.inline
  def `doc-colophon`: typings.ariaQuery.ariaQueryStrings.`doc-colophon` = "doc-colophon".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-colophon`]
  @scala.inline
  def `doc-conclusion`: typings.ariaQuery.ariaQueryStrings.`doc-conclusion` = "doc-conclusion".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-conclusion`]
  @scala.inline
  def `doc-cover`: typings.ariaQuery.ariaQueryStrings.`doc-cover` = "doc-cover".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-cover`]
  @scala.inline
  def `doc-credit`: typings.ariaQuery.ariaQueryStrings.`doc-credit` = "doc-credit".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-credit`]
  @scala.inline
  def `doc-credits`: typings.ariaQuery.ariaQueryStrings.`doc-credits` = "doc-credits".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-credits`]
  @scala.inline
  def `doc-dedication`: typings.ariaQuery.ariaQueryStrings.`doc-dedication` = "doc-dedication".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-dedication`]
  @scala.inline
  def `doc-endnote`: typings.ariaQuery.ariaQueryStrings.`doc-endnote` = "doc-endnote".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-endnote`]
  @scala.inline
  def `doc-endnotes`: typings.ariaQuery.ariaQueryStrings.`doc-endnotes` = "doc-endnotes".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-endnotes`]
  @scala.inline
  def `doc-epigraph`: typings.ariaQuery.ariaQueryStrings.`doc-epigraph` = "doc-epigraph".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-epigraph`]
  @scala.inline
  def `doc-epilogue`: typings.ariaQuery.ariaQueryStrings.`doc-epilogue` = "doc-epilogue".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-epilogue`]
  @scala.inline
  def `doc-errata`: typings.ariaQuery.ariaQueryStrings.`doc-errata` = "doc-errata".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-errata`]
  @scala.inline
  def `doc-example`: typings.ariaQuery.ariaQueryStrings.`doc-example` = "doc-example".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-example`]
  @scala.inline
  def `doc-footnote`: typings.ariaQuery.ariaQueryStrings.`doc-footnote` = "doc-footnote".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-footnote`]
  @scala.inline
  def `doc-foreword`: typings.ariaQuery.ariaQueryStrings.`doc-foreword` = "doc-foreword".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-foreword`]
  @scala.inline
  def `doc-glossary`: typings.ariaQuery.ariaQueryStrings.`doc-glossary` = "doc-glossary".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-glossary`]
  @scala.inline
  def `doc-glossref`: typings.ariaQuery.ariaQueryStrings.`doc-glossref` = "doc-glossref".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-glossref`]
  @scala.inline
  def `doc-index`: typings.ariaQuery.ariaQueryStrings.`doc-index` = "doc-index".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-index`]
  @scala.inline
  def `doc-introduction`: typings.ariaQuery.ariaQueryStrings.`doc-introduction` = "doc-introduction".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-introduction`]
  @scala.inline
  def `doc-noteref`: typings.ariaQuery.ariaQueryStrings.`doc-noteref` = "doc-noteref".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-noteref`]
  @scala.inline
  def `doc-notice`: typings.ariaQuery.ariaQueryStrings.`doc-notice` = "doc-notice".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-notice`]
  @scala.inline
  def `doc-pagebreak`: typings.ariaQuery.ariaQueryStrings.`doc-pagebreak` = "doc-pagebreak".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-pagebreak`]
  @scala.inline
  def `doc-pagelist`: typings.ariaQuery.ariaQueryStrings.`doc-pagelist` = "doc-pagelist".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-pagelist`]
  @scala.inline
  def `doc-part`: typings.ariaQuery.ariaQueryStrings.`doc-part` = "doc-part".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-part`]
  @scala.inline
  def `doc-preface`: typings.ariaQuery.ariaQueryStrings.`doc-preface` = "doc-preface".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-preface`]
  @scala.inline
  def `doc-prologue`: typings.ariaQuery.ariaQueryStrings.`doc-prologue` = "doc-prologue".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-prologue`]
  @scala.inline
  def `doc-pullquote`: typings.ariaQuery.ariaQueryStrings.`doc-pullquote` = "doc-pullquote".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-pullquote`]
  @scala.inline
  def `doc-qna`: typings.ariaQuery.ariaQueryStrings.`doc-qna` = "doc-qna".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-qna`]
  @scala.inline
  def `doc-subtitle`: typings.ariaQuery.ariaQueryStrings.`doc-subtitle` = "doc-subtitle".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-subtitle`]
  @scala.inline
  def `doc-tip`: typings.ariaQuery.ariaQueryStrings.`doc-tip` = "doc-tip".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-tip`]
  @scala.inline
  def `doc-toc`: typings.ariaQuery.ariaQueryStrings.`doc-toc` = "doc-toc".asInstanceOf[typings.ariaQuery.ariaQueryStrings.`doc-toc`]
  @scala.inline
  def document: typings.ariaQuery.ariaQueryStrings.document = "document".asInstanceOf[typings.ariaQuery.ariaQueryStrings.document]
  @scala.inline
  def feed: typings.ariaQuery.ariaQueryStrings.feed = "feed".asInstanceOf[typings.ariaQuery.ariaQueryStrings.feed]
  @scala.inline
  def figure: typings.ariaQuery.ariaQueryStrings.figure = "figure".asInstanceOf[typings.ariaQuery.ariaQueryStrings.figure]
  @scala.inline
  def form: typings.ariaQuery.ariaQueryStrings.form = "form".asInstanceOf[typings.ariaQuery.ariaQueryStrings.form]
  @scala.inline
  def grid: typings.ariaQuery.ariaQueryStrings.grid = "grid".asInstanceOf[typings.ariaQuery.ariaQueryStrings.grid]
  @scala.inline
  def gridcell: typings.ariaQuery.ariaQueryStrings.gridcell = "gridcell".asInstanceOf[typings.ariaQuery.ariaQueryStrings.gridcell]
  @scala.inline
  def group: typings.ariaQuery.ariaQueryStrings.group = "group".asInstanceOf[typings.ariaQuery.ariaQueryStrings.group]
  @scala.inline
  def heading: typings.ariaQuery.ariaQueryStrings.heading = "heading".asInstanceOf[typings.ariaQuery.ariaQueryStrings.heading]
  @scala.inline
  def img: typings.ariaQuery.ariaQueryStrings.img = "img".asInstanceOf[typings.ariaQuery.ariaQueryStrings.img]
  @scala.inline
  def input: typings.ariaQuery.ariaQueryStrings.input = "input".asInstanceOf[typings.ariaQuery.ariaQueryStrings.input]
  @scala.inline
  def landmark: typings.ariaQuery.ariaQueryStrings.landmark = "landmark".asInstanceOf[typings.ariaQuery.ariaQueryStrings.landmark]
  @scala.inline
  def link: typings.ariaQuery.ariaQueryStrings.link = "link".asInstanceOf[typings.ariaQuery.ariaQueryStrings.link]
  @scala.inline
  def list: typings.ariaQuery.ariaQueryStrings.list = "list".asInstanceOf[typings.ariaQuery.ariaQueryStrings.list]
  @scala.inline
  def listbox: typings.ariaQuery.ariaQueryStrings.listbox = "listbox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.listbox]
  @scala.inline
  def listitem: typings.ariaQuery.ariaQueryStrings.listitem = "listitem".asInstanceOf[typings.ariaQuery.ariaQueryStrings.listitem]
  @scala.inline
  def log: typings.ariaQuery.ariaQueryStrings.log = "log".asInstanceOf[typings.ariaQuery.ariaQueryStrings.log]
  @scala.inline
  def main: typings.ariaQuery.ariaQueryStrings.main = "main".asInstanceOf[typings.ariaQuery.ariaQueryStrings.main]
  @scala.inline
  def marquee: typings.ariaQuery.ariaQueryStrings.marquee = "marquee".asInstanceOf[typings.ariaQuery.ariaQueryStrings.marquee]
  @scala.inline
  def math: typings.ariaQuery.ariaQueryStrings.math = "math".asInstanceOf[typings.ariaQuery.ariaQueryStrings.math]
  @scala.inline
  def menu: typings.ariaQuery.ariaQueryStrings.menu = "menu".asInstanceOf[typings.ariaQuery.ariaQueryStrings.menu]
  @scala.inline
  def menubar: typings.ariaQuery.ariaQueryStrings.menubar = "menubar".asInstanceOf[typings.ariaQuery.ariaQueryStrings.menubar]
  @scala.inline
  def menuitem: typings.ariaQuery.ariaQueryStrings.menuitem = "menuitem".asInstanceOf[typings.ariaQuery.ariaQueryStrings.menuitem]
  @scala.inline
  def menuitemcheckbox: typings.ariaQuery.ariaQueryStrings.menuitemcheckbox = "menuitemcheckbox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.menuitemcheckbox]
  @scala.inline
  def menuitemradio: typings.ariaQuery.ariaQueryStrings.menuitemradio = "menuitemradio".asInstanceOf[typings.ariaQuery.ariaQueryStrings.menuitemradio]
  @scala.inline
  def navigation: typings.ariaQuery.ariaQueryStrings.navigation = "navigation".asInstanceOf[typings.ariaQuery.ariaQueryStrings.navigation]
  @scala.inline
  def none: typings.ariaQuery.ariaQueryStrings.none = "none".asInstanceOf[typings.ariaQuery.ariaQueryStrings.none]
  @scala.inline
  def note: typings.ariaQuery.ariaQueryStrings.note = "note".asInstanceOf[typings.ariaQuery.ariaQueryStrings.note]
  @scala.inline
  def option: typings.ariaQuery.ariaQueryStrings.option = "option".asInstanceOf[typings.ariaQuery.ariaQueryStrings.option]
  @scala.inline
  def presentation: typings.ariaQuery.ariaQueryStrings.presentation = "presentation".asInstanceOf[typings.ariaQuery.ariaQueryStrings.presentation]
  @scala.inline
  def progressbar: typings.ariaQuery.ariaQueryStrings.progressbar = "progressbar".asInstanceOf[typings.ariaQuery.ariaQueryStrings.progressbar]
  @scala.inline
  def radio: typings.ariaQuery.ariaQueryStrings.radio = "radio".asInstanceOf[typings.ariaQuery.ariaQueryStrings.radio]
  @scala.inline
  def radiogroup: typings.ariaQuery.ariaQueryStrings.radiogroup = "radiogroup".asInstanceOf[typings.ariaQuery.ariaQueryStrings.radiogroup]
  @scala.inline
  def range: typings.ariaQuery.ariaQueryStrings.range = "range".asInstanceOf[typings.ariaQuery.ariaQueryStrings.range]
  @scala.inline
  def region: typings.ariaQuery.ariaQueryStrings.region = "region".asInstanceOf[typings.ariaQuery.ariaQueryStrings.region]
  @scala.inline
  def roletype: typings.ariaQuery.ariaQueryStrings.roletype = "roletype".asInstanceOf[typings.ariaQuery.ariaQueryStrings.roletype]
  @scala.inline
  def row: typings.ariaQuery.ariaQueryStrings.row = "row".asInstanceOf[typings.ariaQuery.ariaQueryStrings.row]
  @scala.inline
  def rowgroup: typings.ariaQuery.ariaQueryStrings.rowgroup = "rowgroup".asInstanceOf[typings.ariaQuery.ariaQueryStrings.rowgroup]
  @scala.inline
  def rowheader: typings.ariaQuery.ariaQueryStrings.rowheader = "rowheader".asInstanceOf[typings.ariaQuery.ariaQueryStrings.rowheader]
  @scala.inline
  def scrollbar: typings.ariaQuery.ariaQueryStrings.scrollbar = "scrollbar".asInstanceOf[typings.ariaQuery.ariaQueryStrings.scrollbar]
  @scala.inline
  def search: typings.ariaQuery.ariaQueryStrings.search = "search".asInstanceOf[typings.ariaQuery.ariaQueryStrings.search]
  @scala.inline
  def searchbox: typings.ariaQuery.ariaQueryStrings.searchbox = "searchbox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.searchbox]
  @scala.inline
  def section: typings.ariaQuery.ariaQueryStrings.section = "section".asInstanceOf[typings.ariaQuery.ariaQueryStrings.section]
  @scala.inline
  def sectionhead: typings.ariaQuery.ariaQueryStrings.sectionhead = "sectionhead".asInstanceOf[typings.ariaQuery.ariaQueryStrings.sectionhead]
  @scala.inline
  def select: typings.ariaQuery.ariaQueryStrings.select = "select".asInstanceOf[typings.ariaQuery.ariaQueryStrings.select]
  @scala.inline
  def separator: typings.ariaQuery.ariaQueryStrings.separator = "separator".asInstanceOf[typings.ariaQuery.ariaQueryStrings.separator]
  @scala.inline
  def slider: typings.ariaQuery.ariaQueryStrings.slider = "slider".asInstanceOf[typings.ariaQuery.ariaQueryStrings.slider]
  @scala.inline
  def spinbutton: typings.ariaQuery.ariaQueryStrings.spinbutton = "spinbutton".asInstanceOf[typings.ariaQuery.ariaQueryStrings.spinbutton]
  @scala.inline
  def status: typings.ariaQuery.ariaQueryStrings.status = "status".asInstanceOf[typings.ariaQuery.ariaQueryStrings.status]
  @scala.inline
  def structure: typings.ariaQuery.ariaQueryStrings.structure = "structure".asInstanceOf[typings.ariaQuery.ariaQueryStrings.structure]
  @scala.inline
  def switch: typings.ariaQuery.ariaQueryStrings.switch = "switch".asInstanceOf[typings.ariaQuery.ariaQueryStrings.switch]
  @scala.inline
  def tab: typings.ariaQuery.ariaQueryStrings.tab = "tab".asInstanceOf[typings.ariaQuery.ariaQueryStrings.tab]
  @scala.inline
  def table: typings.ariaQuery.ariaQueryStrings.table = "table".asInstanceOf[typings.ariaQuery.ariaQueryStrings.table]
  @scala.inline
  def tablist: typings.ariaQuery.ariaQueryStrings.tablist = "tablist".asInstanceOf[typings.ariaQuery.ariaQueryStrings.tablist]
  @scala.inline
  def tabpanel: typings.ariaQuery.ariaQueryStrings.tabpanel = "tabpanel".asInstanceOf[typings.ariaQuery.ariaQueryStrings.tabpanel]
  @scala.inline
  def term: typings.ariaQuery.ariaQueryStrings.term = "term".asInstanceOf[typings.ariaQuery.ariaQueryStrings.term]
  @scala.inline
  def textbox: typings.ariaQuery.ariaQueryStrings.textbox = "textbox".asInstanceOf[typings.ariaQuery.ariaQueryStrings.textbox]
  @scala.inline
  def timer: typings.ariaQuery.ariaQueryStrings.timer = "timer".asInstanceOf[typings.ariaQuery.ariaQueryStrings.timer]
  @scala.inline
  def toolbar: typings.ariaQuery.ariaQueryStrings.toolbar = "toolbar".asInstanceOf[typings.ariaQuery.ariaQueryStrings.toolbar]
  @scala.inline
  def tooltip: typings.ariaQuery.ariaQueryStrings.tooltip = "tooltip".asInstanceOf[typings.ariaQuery.ariaQueryStrings.tooltip]
  @scala.inline
  def tree: typings.ariaQuery.ariaQueryStrings.tree = "tree".asInstanceOf[typings.ariaQuery.ariaQueryStrings.tree]
  @scala.inline
  def treegrid: typings.ariaQuery.ariaQueryStrings.treegrid = "treegrid".asInstanceOf[typings.ariaQuery.ariaQueryStrings.treegrid]
  @scala.inline
  def treeitem: typings.ariaQuery.ariaQueryStrings.treeitem = "treeitem".asInstanceOf[typings.ariaQuery.ariaQueryStrings.treeitem]
  @scala.inline
  def widget: typings.ariaQuery.ariaQueryStrings.widget = "widget".asInstanceOf[typings.ariaQuery.ariaQueryStrings.widget]
  @scala.inline
  def window: typings.ariaQuery.ariaQueryStrings.window = "window".asInstanceOf[typings.ariaQuery.ariaQueryStrings.window]
}

