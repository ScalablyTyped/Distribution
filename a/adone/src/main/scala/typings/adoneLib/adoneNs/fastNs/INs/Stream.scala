package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:no-empty-interface */
@js.native
trait Stream[S, T]
  extends adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] {
  /**
                   * Changes file mode
                   */
  def chmod(): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(mode: adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(
    mode: adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode,
    dirMode: adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode
  ): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(mode: adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode, dirMode: scala.Double): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(mode: scala.Double): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(mode: scala.Double, dirMode: adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode): this.type = js.native
  /**
                   * Changes file mode
                   */
  def chmod(mode: scala.Double, dirMode: scala.Double): this.type = js.native
  /**
                   * Compresses all files using the given compressor
                   */
  def compress(`this`: js.Object, `type`: adoneLib.adoneNs.fastNs.INs.pluginNs.compressorNs.Compressor): this.type = js.native
  /**
                   * Compresses all files using the given compressor
                   */
  def compress(
    `this`: js.Object,
    `type`: adoneLib.adoneNs.fastNs.INs.pluginNs.compressorNs.Compressor,
    options: adoneLib.Anon_Key
  ): this.type = js.native
  /**
                   * concats all files into one
                   */
  def concat(file: adoneLib.Anon_Path): this.type = js.native
  /**
                   * concats all files into one
                   */
  def concat(file: adoneLib.Anon_Path, options: adoneLib.Anon_NewLine): this.type = js.native
  /**
                   * concats all files into one
                   */
  def concat(file: java.lang.String): this.type = js.native
  /**
                   * concats all files into one
                   */
  def concat(file: java.lang.String, options: adoneLib.Anon_NewLine): this.type = js.native
  /**
                   * Decompresses all files using the given compressor
                   */
  def decompress(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.compressorNs.Compressor): this.type = js.native
  /**
                   * Decompresses all files using the given compressor
                   */
  def decompress(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.compressorNs.Compressor, options: js.Object): this.type = js.native
   // TODO adone.js.transpiler options
  /**
                   * Deletes lines from files
                   */
  def deleteLines(filters: js.Array[stdLib.RegExp]): this.type = js.native
   // TODO adone.js.transpiler options
  /**
                   * Deletes lines from files
                   */
  def deleteLines(filters: stdLib.RegExp): this.type = js.native
  /**
                   * Notify about passing through files
                   */
  def notify(
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg[T, adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.Options[T]]
  ): this.type = js.native
  /**
                   * Notify about errors
                   */
  def notifyError(): this.type = js.native
  /**
                   * Notify about errors
                   */
  def notifyError(
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg[T, adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs.OnErrorOptions[T]]
  ): this.type = js.native
  /**
                   * Packs all files into one archive of the given type
                   */
  def pack(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.archiveNs.Archiver): this.type = js.native
  /**
                   * Packs all files into one archive of the given type
                   */
  def pack(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.archiveNs.Archiver, options: js.Object): this.type = js.native
  /**
                   * sets new filename
                   */
  def rename(filename: java.lang.String): this.type = js.native
  def rename(handle: adoneLib.Anon_Dirname): this.type = js.native
  def rename(handler: js.Function1[/* handle */ adoneLib.Anon_DirnameBasename, scala.Unit]): this.type = js.native
  /**
                   * Replaces contents
                   */
  def replace(search: java.lang.String, replacement: java.lang.String): this.type = js.native
  /**
                   * Replaces contents
                   */
  def replace(
    search: java.lang.String,
    replacement: js.Function1[/* search */ java.lang.String, java.lang.String]
  ): this.type = js.native
  def replace(
    search: js.Array[java.lang.String | stdLib.RegExp],
    replacement: js.Array[
      java.lang.String | (js.Function1[/* search */ java.lang.String, java.lang.String])
    ]
  ): this.type = js.native
  def replace(search: stdLib.RegExp, replacement: java.lang.String): this.type = js.native
  /**
                   * Static asset revisioning by appending content hash to filenames
                   */
  def revisionHash(): this.type = js.native
  /**
                   * Static asset revisioning by appending content hash to filenames
                   */
  def revisionHash(options: adoneLib.Anon_Manifest): this.type = js.native
  /**
                   * Rewrite occurrences of filenames which have been renamed by revisionHash
                   */
  def revisionHashReplace(): this.type = js.native
  /**
                   * Rewrite occurrences of filenames which have been renamed by revisionHash
                   */
  def revisionHashReplace(options: adoneLib.Anon_ModifyUnreved): this.type = js.native
  def sourcemapsInit(): this.type = js.native
  def sourcemapsInit(options: adoneLib.Anon_LargeFile): this.type = js.native
  def sourcemapsWrite(): this.type = js.native
  /**
                   *
                   *
                   * @param dest destination directory
                   */
  def sourcemapsWrite(dest: java.lang.String): this.type = js.native
  /**
                   *
                   *
                   * @param dest destination directory
                   */
  def sourcemapsWrite(dest: java.lang.String, options: adoneLib.adoneNs.fastNs.INs.pluginNs.sourcemapsNs.WriteOptions[T]): this.type = js.native
  def sourcemapsWrite(options: adoneLib.adoneNs.fastNs.INs.pluginNs.sourcemapsNs.WriteOptions[T]): this.type = js.native
  /**
                   * transpiles files
                   */
  def transpile(options: js.Object): this.type = js.native
  /**
                   * Unpacks the incoming files using the given archive type
                   */
  def unpack(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.archiveNs.Archiver): this.type = js.native
  /**
                   * Unpacks the incoming files using the given archive type
                   */
  def unpack(`type`: adoneLib.adoneNs.fastNs.INs.pluginNs.archiveNs.Archiver, options: js.Object): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: adoneLib.Anon_Src): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: adoneLib.Anon_Src, data: js.Function1[/* file */ T, js.Object]): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: adoneLib.Anon_Src,
    data: js.Function1[/* file */ T, js.Object],
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: adoneLib.Anon_Src,
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: adoneLib.Anon_Src, data: js.Object): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: adoneLib.Anon_Src,
    data: js.Object,
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: adoneLib.Anon_Src,
    data: js.Object,
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: java.lang.String): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: java.lang.String, data: js.Function1[/* file */ T, js.Object]): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: java.lang.String,
    data: js.Function1[/* file */ T, js.Object],
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: java.lang.String,
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(template: java.lang.String, data: js.Object): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: java.lang.String,
    data: js.Object,
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: java.lang.String,
    data: js.Object,
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Function1[/* file */ T, js.Object]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Function1[/* file */ T, js.Object],
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Object
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Object,
    options: adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
                   * Wraps contents
                   */
  def wrap(
    template: js.Function1[
      /* data */ adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData[T], 
      java.lang.String
    ],
    data: js.Object,
    options: js.Function1[/* file */ T, adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
}

