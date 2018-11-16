package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationQueryOptions extends AnimationOptions {
  /**
       * A maximum total number of results to return from the query.
       * If negative, results are limited from the end of the query list towards the beginning.
       * By default, results are not limited.
       */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
       * True if this query is optional, false if it is required. Default is false.
       * A required query throws an error if no elements are retrieved when
       * the query is executed. An optional query does not.
       *
       */
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}

