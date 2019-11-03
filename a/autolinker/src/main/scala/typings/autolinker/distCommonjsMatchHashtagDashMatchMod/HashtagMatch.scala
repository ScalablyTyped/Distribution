package typings.autolinker.distCommonjsMatchHashtagDashMatchMod

import typings.autolinker.distCommonjsMatchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match/hashtag-match", "HashtagMatch")
@js.native
class HashtagMatch protected () extends Match {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match
    *   instance, specified in an Object (map).
    */
  def this(cfg: HashtagMatchConfig) = this()
  /**
    * @cfg {String} hashtag (required)
    *
    * The HashtagMatch that was matched, without the '#'.
    */
  val hashtag: js.Any = js.native
  /**
    * @cfg {String} serviceName
    *
    * The service to point hashtag matches to. See {@link Autolinker#hashtag}
    * for available values.
    */
  val serviceName: js.Any = js.native
  /**
    * Returns the matched hashtag, without the '#' character.
    *
    * @return {String}
    */
  def getHashtag(): String = js.native
  /**
    * Returns the configured {@link #serviceName} to point the HashtagMatch to.
    * Ex: 'facebook', 'twitter'.
    *
    * @return {String}
    */
  def getServiceName(): String = js.native
}

