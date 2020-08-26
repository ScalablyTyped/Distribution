package typings.angularCompiler.summaryResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AotSummaryResolverHost extends js.Object {
  /**
    * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
    * given the fileName of the library that is referrig to it.
    */
  def fromSummaryFileName(fileName: String, referringLibFileName: String): String = js.native
  /**
    * Returns whether a file is a source file or not.
    */
  def isSourceFile(sourceFilePath: String): Boolean = js.native
  /**
    * Loads an NgModule/Directive/Pipe summary file
    */
  def loadSummary(filePath: String): String | Null = js.native
  /**
    * Converts a file name into a representation that should be stored in a summary file.
    * This has to include changing the suffix as well.
    * E.g.
    * `some_file.ts` -> `some_file.d.ts`
    *
    * @param referringSrcFileName the soure file that refers to fileName
    */
  def toSummaryFileName(fileName: String, referringSrcFileName: String): String = js.native
}

object AotSummaryResolverHost {
  @scala.inline
  def apply(
    fromSummaryFileName: (String, String) => String,
    isSourceFile: String => Boolean,
    loadSummary: String => String | Null,
    toSummaryFileName: (String, String) => String
  ): AotSummaryResolverHost = {
    val __obj = js.Dynamic.literal(fromSummaryFileName = js.Any.fromFunction2(fromSummaryFileName), isSourceFile = js.Any.fromFunction1(isSourceFile), loadSummary = js.Any.fromFunction1(loadSummary), toSummaryFileName = js.Any.fromFunction2(toSummaryFileName))
    __obj.asInstanceOf[AotSummaryResolverHost]
  }
  @scala.inline
  implicit class AotSummaryResolverHostOps[Self <: AotSummaryResolverHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromSummaryFileName(value: (String, String) => String): Self = this.set("fromSummaryFileName", js.Any.fromFunction2(value))
    @scala.inline
    def setIsSourceFile(value: String => Boolean): Self = this.set("isSourceFile", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadSummary(value: String => String | Null): Self = this.set("loadSummary", js.Any.fromFunction1(value))
    @scala.inline
    def setToSummaryFileName(value: (String, String) => String): Self = this.set("toSummaryFileName", js.Any.fromFunction2(value))
  }
  
}

