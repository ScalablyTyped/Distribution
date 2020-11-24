package typings.ariClient.mod

import typings.ariClient.anon.FormatLang
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sound extends Resource {
  
  /**
    * The formats and languages in which this sound is available.
    */
  var formats: FormatLangPair | js.Array[FormatLangPair] = js.native
  
  /**
    * Get a sounds details.
    */
  def get(): js.Promise[Sound] = js.native
  /**
    * Get a sounds details.
    */
  def get(callback: js.Function2[/* err */ Error, /* sound */ this.type, Unit]): Unit = js.native
  
  /**
    * Sounds identifier.
    */
  var id: String = js.native
  
  /**
    * List all sounds.
    *
    * @param [params.lang] - Lookup sound for a specific language.
    * @param [params.format] - Lookup sound in a specific format.
    */
  def list(): js.Promise[js.Array[Sound]] = js.native
  /**
    * List all sounds.
    */
  def list(callback: js.Function2[/* err */ Error, /* sounds */ js.Array[this.type], Unit]): Unit = js.native
  def list(params: FormatLang): js.Promise[js.Array[Sound]] = js.native
  /**
    * List all sounds.
    *
    * @param [params.lang] - Lookup sound for a specific language.
    * @param [params.format] - Lookup sound in a specific format.
    */
  def list(
    params: FormatLang,
    callback: js.Function2[/* err */ Error, /* sounds */ js.Array[this.type], Unit]
  ): Unit = js.native
  
  /**
    * Text description of the sound, usually the words spoken.
    */
  var text: js.UndefOr[String] = js.native
}
