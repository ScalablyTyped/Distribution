package typings
package atAngularCompilerLib.srcAotSummaryUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotSummaryResolverHost extends js.Object {
  /**
    * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
    * given the fileName of the library that is referrig to it.
    */
  def fromSummaryFileName(fileName: java.lang.String, referringLibFileName: java.lang.String): java.lang.String
  /**
    * Returns whether a file is a source file or not.
    */
  def isSourceFile(sourceFilePath: java.lang.String): scala.Boolean
  /**
    * Loads an NgModule/Directive/Pipe summary file
    */
  def loadSummary(filePath: java.lang.String): java.lang.String | scala.Null
  /**
    * Converts a file name into a representation that should be stored in a summary file.
    * This has to include changing the suffix as well.
    * E.g.
    * `some_file.ts` -> `some_file.d.ts`
    *
    * @param referringSrcFileName the soure file that refers to fileName
    */
  def toSummaryFileName(fileName: java.lang.String, referringSrcFileName: java.lang.String): java.lang.String
}

object AotSummaryResolverHost {
  @scala.inline
  def apply(
    fromSummaryFileName: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    isSourceFile: js.Function1[java.lang.String, scala.Boolean],
    loadSummary: js.Function1[java.lang.String, java.lang.String | scala.Null],
    toSummaryFileName: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): AotSummaryResolverHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSummaryFileName")(fromSummaryFileName)
    __obj.updateDynamic("isSourceFile")(isSourceFile)
    __obj.updateDynamic("loadSummary")(loadSummary)
    __obj.updateDynamic("toSummaryFileName")(toSummaryFileName)
    __obj.asInstanceOf[AotSummaryResolverHost]
  }
}

