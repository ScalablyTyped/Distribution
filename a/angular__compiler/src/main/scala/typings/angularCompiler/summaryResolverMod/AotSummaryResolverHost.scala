package typings.angularCompiler.summaryResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotSummaryResolverHost extends js.Object {
  /**
    * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
    * given the fileName of the library that is referrig to it.
    */
  def fromSummaryFileName(fileName: String, referringLibFileName: String): String
  /**
    * Returns whether a file is a source file or not.
    */
  def isSourceFile(sourceFilePath: String): Boolean
  /**
    * Loads an NgModule/Directive/Pipe summary file
    */
  def loadSummary(filePath: String): String | Null
  /**
    * Converts a file name into a representation that should be stored in a summary file.
    * This has to include changing the suffix as well.
    * E.g.
    * `some_file.ts` -> `some_file.d.ts`
    *
    * @param referringSrcFileName the soure file that refers to fileName
    */
  def toSummaryFileName(fileName: String, referringSrcFileName: String): String
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
}

