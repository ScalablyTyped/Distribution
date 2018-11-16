package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationSequenceMetadata extends AnimationMetadata {
  /**
       * An options object containing a delay and
       * developer-defined parameters that provide styling defaults and
       * can be overridden on invocation. Default delay is 0.
       */
  var options: AnimationOptions | scala.Null
  /**
       *  An array of animation step objects.
       */
  var steps: js.Array[AnimationMetadata]
}

