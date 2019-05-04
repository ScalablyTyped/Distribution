package typings
package ansiUnderscoreUpLib.ansiUnderscoreUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi_up", JSImport.Default)
@js.native
class default () extends AnsiUp {
  /* CompleteClass */
  override var VERSION: java.lang.String = js.native
  /* CompleteClass */
  override var _buffer: js.Any = js.native
  /* CompleteClass */
  override var _escape_for_html: js.Any = js.native
  /* CompleteClass */
  override var _sgr_regex: js.Any = js.native
  /* CompleteClass */
  override var _use_classes: js.Any = js.native
  /* CompleteClass */
  override var ansi_colors: js.Array[js.Array[ansiUnderscoreUpLib.Anon_Classname]] = js.native
  /* CompleteClass */
  override var bg: js.Any = js.native
  /* CompleteClass */
  override var bold: js.Any = js.native
  /* CompleteClass */
  override var escape_for_html: scala.Boolean = js.native
  /* CompleteClass */
  override var fg: js.Any = js.native
  /* CompleteClass */
  override var htmlFormatter: Formatter = js.native
  /* CompleteClass */
  override var palette_256: js.Any = js.native
  /* CompleteClass */
  override var textFormatter: Formatter = js.native
  /* CompleteClass */
  override var use_classes: scala.Boolean = js.native
  /* CompleteClass */
  override def ansi_to(txt: java.lang.String, formatter: Formatter): js.Any = js.native
  /* CompleteClass */
  override def ansi_to_html(txt: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def ansi_to_text(txt: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  /* private */ override def detect_incomplete_ansi(txt: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def detect_incomplete_link(txt: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def handle_incomplete_sequences(chunks: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def old_escape_for_html(txt: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def old_linkify(txt: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def process_ansi(block: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def setup_256_palette(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def with_state(text: js.Any): js.Any = js.native
}

