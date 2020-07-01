package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  var artifact: Location
  var `build-complete`: Boolean
  var `build-number`: Double
  var `build-start-time`: String
  var cache: Type
  var environment: Computetype
  var initiator: String
  var logs: Deeplink
  var phases: js.Array[Durationinseconds]
  var `project-file-system-locations`: js.Array[js.Any]
  var `queued-timeout-in-minutes`: Double
  var source: Buildspec
  var `source-version`: String
  var `timeout-in-minutes`: Double
}

object Artifact {
  @scala.inline
  def apply(
    artifact: Location,
    `build-complete`: Boolean,
    `build-number`: Double,
    `build-start-time`: String,
    cache: Type,
    environment: Computetype,
    initiator: String,
    logs: Deeplink,
    phases: js.Array[Durationinseconds],
    `project-file-system-locations`: js.Array[js.Any],
    `queued-timeout-in-minutes`: Double,
    source: Buildspec,
    `source-version`: String,
    `timeout-in-minutes`: Double
  ): Artifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("build-complete")(`build-complete`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-number")(`build-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-start-time")(`build-start-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-file-system-locations")(`project-file-system-locations`.asInstanceOf[js.Any])
    __obj.updateDynamic("queued-timeout-in-minutes")(`queued-timeout-in-minutes`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-version")(`source-version`.asInstanceOf[js.Any])
    __obj.updateDynamic("timeout-in-minutes")(`timeout-in-minutes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
}

