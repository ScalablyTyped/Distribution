package typings.asyncCsv.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async-csv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param options
    */
  def generate(): js.Promise[js.Array[_]] = js.native
  def generate(options: CsvGenerateOptions): js.Promise[js.Array[_]] = js.native
  
  /**
    * Parses a CSV file into an array of rows.
    *
    * @param input
    * @param options
    */
  def parse(input: String): js.Promise[js.Array[_]] = js.native
  def parse(input: String, options: CsvParseOptions): js.Promise[js.Array[_]] = js.native
  
  /**
    * Converts an array of rows into a CSV string.
    *
    * @param data
    * @param options
    */
  def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]]): js.Promise[String] = js.native
  def stringify(data: js.Array[js.Array[js.UndefOr[String | Double | Null]]], options: CsvStringifyOptions): js.Promise[String] = js.native
  
  /**
    *
    * @param data
    * @param handler
    * @param options
    */
  def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[js.Any], 
      U
    ]
  ): js.Promise[js.Array[U]] = js.native
  def transform[T, U](
    data: js.Array[T],
    handler: js.Function3[
      /* record */ T, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* record */ js.UndefOr[T], Unit], 
      /* params */ js.UndefOr[js.Any], 
      U
    ],
    options: TransformOptions
  ): js.Promise[js.Array[U]] = js.native
}
