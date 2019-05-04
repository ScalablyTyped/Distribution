package typings
package ansiUnderscoreUpLib.ansiUnderscoreUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnsiUp extends js.Object {
  var VERSION: java.lang.String
  var _buffer: js.Any
  var _escape_for_html: js.Any
  var _sgr_regex: js.Any
  var _use_classes: js.Any
  var ansi_colors: js.Array[js.Array[ansiUnderscoreUpLib.Anon_Classname]]
  var bg: js.Any
  var bold: js.Any
  var escape_for_html: scala.Boolean
  var fg: js.Any
  var htmlFormatter: Formatter
  var palette_256: js.Any
  var textFormatter: Formatter
  var use_classes: scala.Boolean
  def ansi_to(txt: java.lang.String, formatter: Formatter): js.Any
  def ansi_to_html(txt: java.lang.String): java.lang.String
  def ansi_to_text(txt: java.lang.String): java.lang.String
  /* private */ def detect_incomplete_ansi(txt: js.Any): js.Any
  /* private */ def detect_incomplete_link(txt: js.Any): js.Any
  /* private */ def handle_incomplete_sequences(chunks: js.Any): js.Any
  /* private */ def old_escape_for_html(txt: js.Any): js.Any
  /* private */ def old_linkify(txt: js.Any): js.Any
  /* private */ def process_ansi(block: js.Any): js.Any
  /* private */ def setup_256_palette(): js.Any
  /* private */ def with_state(text: js.Any): js.Any
}

object AnsiUp {
  @scala.inline
  def apply(
    VERSION: java.lang.String,
    _buffer: js.Any,
    _escape_for_html: js.Any,
    _sgr_regex: js.Any,
    _use_classes: js.Any,
    ansi_colors: js.Array[js.Array[ansiUnderscoreUpLib.Anon_Classname]],
    ansi_to: (java.lang.String, Formatter) => js.Any,
    ansi_to_html: java.lang.String => java.lang.String,
    ansi_to_text: java.lang.String => java.lang.String,
    bg: js.Any,
    bold: js.Any,
    detect_incomplete_ansi: js.Any => js.Any,
    detect_incomplete_link: js.Any => js.Any,
    escape_for_html: scala.Boolean,
    fg: js.Any,
    handle_incomplete_sequences: js.Any => js.Any,
    htmlFormatter: Formatter,
    old_escape_for_html: js.Any => js.Any,
    old_linkify: js.Any => js.Any,
    palette_256: js.Any,
    process_ansi: js.Any => js.Any,
    setup_256_palette: () => js.Any,
    textFormatter: Formatter,
    use_classes: scala.Boolean,
    with_state: js.Any => js.Any
  ): AnsiUp = {
    val __obj = js.Dynamic.literal(VERSION = VERSION, _buffer = _buffer, _escape_for_html = _escape_for_html, _sgr_regex = _sgr_regex, _use_classes = _use_classes, ansi_colors = ansi_colors, ansi_to = js.Any.fromFunction2(ansi_to), ansi_to_html = js.Any.fromFunction1(ansi_to_html), ansi_to_text = js.Any.fromFunction1(ansi_to_text), bg = bg, bold = bold, detect_incomplete_ansi = js.Any.fromFunction1(detect_incomplete_ansi), detect_incomplete_link = js.Any.fromFunction1(detect_incomplete_link), escape_for_html = escape_for_html, fg = fg, handle_incomplete_sequences = js.Any.fromFunction1(handle_incomplete_sequences), htmlFormatter = htmlFormatter, old_escape_for_html = js.Any.fromFunction1(old_escape_for_html), old_linkify = js.Any.fromFunction1(old_linkify), palette_256 = palette_256, process_ansi = js.Any.fromFunction1(process_ansi), setup_256_palette = js.Any.fromFunction0(setup_256_palette), textFormatter = textFormatter, use_classes = use_classes, with_state = js.Any.fromFunction1(with_state))
  
    __obj.asInstanceOf[AnsiUp]
  }
}

