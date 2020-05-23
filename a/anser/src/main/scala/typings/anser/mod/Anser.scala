package typings.anser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anser extends js.Object {
  /**
    * Converts ANSI input into HTML output.
    *
    * @param txt The input text.
    * @param options The options.
    * @returns The HTML output.
    */
  def ansiToHtml(txt: String): String = js.native
  def ansiToHtml(txt: String, options: AnserOptions): String = js.native
  /**
    * Converts ANSI input into HTML output.
    *
    * @param txt The input text.
    * @param options The options.
    * @returns The JSON output.
    */
  def ansiToJson(txt: String): js.Array[AnserJsonEntry] = js.native
  def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = js.native
  /**
    * Converts ANSI input into HTML output.
    *
    * @param txt The input text.
    * @returns The text output.
    */
  def ansiToText(txt: String): String = js.native
  def ansiToText(txt: String, options: AnserOptions): String = js.native
  /**
    * Escapes the input text.
    *
    * @param txt The input text.
    * @returns The escpaed HTML output.
    */
  def escapeForHtml(txt: String): String = js.native
  /**
    * Adds HTML link elements.
    *
    * @param txt The input text.
    * @returns The HTML output containing link elements.
    */
  def linkify(txt: String): String = js.native
  def process(txt: String): String = js.native
  def process(txt: String, options: AnserOptions): String = js.native
  def process(txt: String, options: AnserOptions, markup: Boolean): String = js.native
  /**
    * Processes the input.
    *
    * @param txt The input text.
    * @param options The options.
    * @param markup If false, the colors will not be parsed.
    */
  def process(txt: String, options: OptionsWithJson): js.Array[AnserJsonEntry] = js.native
  def process(txt: String, options: OptionsWithJson, markup: Boolean): js.Array[AnserJsonEntry] = js.native
  def processChunk(text: String): String = js.native
  def processChunk(text: String, options: AnserOptions): String = js.native
  def processChunk(text: String, options: AnserOptions, markup: Boolean): String = js.native
  /**
    * Processes the current chunk of text.
    *
    * @param text The input text.
    * @param options The options.
    * @param markup If false, the colors will not be parsed.
    * @return The result (object if `json` is wanted back or string otherwise).
    */
  def processChunk(text: String, options: OptionsWithJson): AnserJsonEntry = js.native
  def processChunk(text: String, options: OptionsWithJson, markup: Boolean): AnserJsonEntry = js.native
  /**
    * Processes the current chunk into json output.
    *
    * @param text The input text.
    * @param options The options.
    * @param markup If false, the colors will not be parsed.
    * @return The JSON output.
    */
  def processChunkJson(text: String): AnserJsonEntry = js.native
  def processChunkJson(text: String, options: AnserOptions): AnserJsonEntry = js.native
  def processChunkJson(text: String, options: AnserOptions, markup: Boolean): AnserJsonEntry = js.native
  /**
    * Sets up the palette.
    */
  def setupPalette(): Unit = js.native
}

