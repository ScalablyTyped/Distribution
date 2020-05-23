package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing options available for gettings the logs
  */
trait LogsOptions extends js.Object {
  /**
    * The index to request logs from
    */
  var indexName: js.UndefOr[String] = js.undefined
  /**
    * Specify the maximum number of entries to retrieve starting at the offset.
    * default: 10
    * maximum: 1000
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Specify the first entry to retrieve (0-based, 0 is the most recent log entry).
    * default: 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated
    * Retrieve only logs with an HTTP code different than 200 or 201
    */
  var onlyErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the type of logs to retrieve
    * 'query' Retrieve only the queries
    * 'build' Retrieve only the build operations
    * 'error' Retrieve only the errors (same as onlyErrors parameters)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object LogsOptions {
  @scala.inline
  def apply(
    indexName: String = null,
    length: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onlyErrors: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): LogsOptions = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyErrors)) __obj.updateDynamic("onlyErrors")(onlyErrors.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsOptions]
  }
}

