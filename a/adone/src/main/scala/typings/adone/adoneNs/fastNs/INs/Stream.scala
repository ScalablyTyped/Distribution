package typings.adone.adoneNs.fastNs.INs

import typings.adone.Anon_Basename
import typings.adone.Anon_BasenameDirname
import typings.adone.Anon_CanonicalUris
import typings.adone.Anon_IdentityMap
import typings.adone.Anon_KeyRename
import typings.adone.Anon_Manifest
import typings.adone.Anon_NewLine
import typings.adone.Anon_Path
import typings.adone.Anon_Src
import typings.adone.adoneNs.fastNs.INs.pluginNs.archiveNs.Archiver
import typings.adone.adoneNs.fastNs.INs.pluginNs.chmodNs.Mode
import typings.adone.adoneNs.fastNs.INs.pluginNs.compressorNs.Compressor
import typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs.OnErrorOptions
import typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs.Options
import typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs.OptionsArg
import typings.adone.adoneNs.fastNs.INs.pluginNs.sourcemapsNs.WriteOptions
import typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.TemplateFunctionData
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:no-empty-interface */
@js.native
trait Stream[S, T]
  extends typings.adone.adoneNs.streamNs.coreNs.Stream[S, T] {
  /**
    * Changes file mode
    */
  def chmod(): this.type = js.native
  def chmod(mode: Double): this.type = js.native
  def chmod(mode: Double, dirMode: Double): this.type = js.native
  def chmod(mode: Double, dirMode: Mode): this.type = js.native
  def chmod(mode: Mode): this.type = js.native
  def chmod(mode: Mode, dirMode: Double): this.type = js.native
  def chmod(mode: Mode, dirMode: Mode): this.type = js.native
  /**
    * Compresses all files using the given compressor
    */
  def compress(`this`: js.Object, `type`: Compressor): this.type = js.native
  def compress(`this`: js.Object, `type`: Compressor, options: Anon_KeyRename): this.type = js.native
  /**
    * concats all files into one
    */
  def concat(file: String): this.type = js.native
  def concat(file: String, options: Anon_NewLine): this.type = js.native
  def concat(file: Anon_Path): this.type = js.native
  def concat(file: Anon_Path, options: Anon_NewLine): this.type = js.native
  /**
    * Decompresses all files using the given compressor
    */
  def decompress(`type`: Compressor): this.type = js.native
  def decompress(`type`: Compressor, options: js.Object): this.type = js.native
  def deleteLines(filters: js.Array[RegExp]): this.type = js.native
   // TODO adone.js.transpiler options
  /**
    * Deletes lines from files
    */
  def deleteLines(filters: RegExp): this.type = js.native
  def notify(options: OptionsArg[T, Options[T]]): this.type = js.native
  /**
    * Notify about errors
    */
  def notifyError(): this.type = js.native
  def notifyError(options: OptionsArg[T, OnErrorOptions[T]]): this.type = js.native
  /**
    * Packs all files into one archive of the given type
    */
  def pack(`type`: Archiver): this.type = js.native
  def pack(`type`: Archiver, options: js.Object): this.type = js.native
  /**
    * sets new filename
    */
  def rename(filename: String): this.type = js.native
  def rename(handler: js.Function1[/* handle */ Anon_BasenameDirname, Unit]): this.type = js.native
  def rename(handle: Anon_Basename): this.type = js.native
  /**
    * Replaces contents
    */
  def replace(search: String, replacement: String): this.type = js.native
  def replace(search: String, replacement: js.Function1[/* search */ String, String]): this.type = js.native
  def replace(
    search: js.Array[String | RegExp],
    replacement: js.Array[String | (js.Function1[/* search */ String, String])]
  ): this.type = js.native
  def replace(search: RegExp, replacement: String): this.type = js.native
  /**
    * Static asset revisioning by appending content hash to filenames
    */
  def revisionHash(): this.type = js.native
  def revisionHash(options: Anon_Manifest): this.type = js.native
  /**
    * Rewrite occurrences of filenames which have been renamed by revisionHash
    */
  def revisionHashReplace(): this.type = js.native
  def revisionHashReplace(options: Anon_CanonicalUris): this.type = js.native
  def sourcemapsInit(): this.type = js.native
  def sourcemapsInit(options: Anon_IdentityMap): this.type = js.native
  def sourcemapsWrite(): this.type = js.native
  /**
    *
    *
    * @param dest destination directory
    */
  def sourcemapsWrite(dest: String): this.type = js.native
  def sourcemapsWrite(dest: String, options: WriteOptions[T]): this.type = js.native
  def sourcemapsWrite(options: WriteOptions[T]): this.type = js.native
  /**
    * transpiles files
    */
  def transpile(options: js.Object): this.type = js.native
  /**
    * Unpacks the incoming files using the given archive type
    */
  def unpack(`type`: Archiver): this.type = js.native
  def unpack(`type`: Archiver, options: js.Object): this.type = js.native
  def wrap(template: String): this.type = js.native
  def wrap(template: String, data: js.Function1[/* file */ T, js.Object]): this.type = js.native
  def wrap(
    template: String,
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: String,
    data: js.Function1[/* file */ T, js.Object],
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  def wrap(template: String, data: js.Object): this.type = js.native
  def wrap(
    template: String,
    data: js.Object,
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: String,
    data: js.Object,
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  def wrap(template: js.Function1[/* data */ TemplateFunctionData[T], String]): this.type = js.native
  def wrap(
    template: js.Function1[/* data */ TemplateFunctionData[T], String],
    data: js.Function1[/* file */ T, js.Object]
  ): this.type = js.native
  def wrap(
    template: js.Function1[/* data */ TemplateFunctionData[T], String],
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: js.Function1[/* data */ TemplateFunctionData[T], String],
    data: js.Function1[/* file */ T, js.Object],
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  def wrap(template: js.Function1[/* data */ TemplateFunctionData[T], String], data: js.Object): this.type = js.native
  def wrap(
    template: js.Function1[/* data */ TemplateFunctionData[T], String],
    data: js.Object,
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: js.Function1[/* data */ TemplateFunctionData[T], String],
    data: js.Object,
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  /**
    * Wraps contents
    */
  def wrap(template: Anon_Src): this.type = js.native
  def wrap(template: Anon_Src, data: js.Function1[/* file */ T, js.Object]): this.type = js.native
  def wrap(
    template: Anon_Src,
    data: js.Function1[/* file */ T, js.Object],
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: Anon_Src,
    data: js.Function1[/* file */ T, js.Object],
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
  def wrap(template: Anon_Src, data: js.Object): this.type = js.native
  def wrap(
    template: Anon_Src,
    data: js.Object,
    options: js.Function1[/* file */ T, typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options]
  ): this.type = js.native
  def wrap(
    template: Anon_Src,
    data: js.Object,
    options: typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs.Options
  ): this.type = js.native
}

