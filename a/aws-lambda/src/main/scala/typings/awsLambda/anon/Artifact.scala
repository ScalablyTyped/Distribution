package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends StObject {
  
  var artifact: Location = js.native
  
  var `build-complete`: Boolean = js.native
  
  var `build-number`: Double = js.native
  
  var `build-start-time`: String = js.native
  
  var cache: Type = js.native
  
  var environment: Computetype = js.native
  
  var initiator: String = js.native
  
  var logs: Deeplink = js.native
  
  var phases: js.Array[Durationinseconds] = js.native
  
  var `project-file-system-locations`: js.Array[js.Any] = js.native
  
  var `queued-timeout-in-minutes`: Double = js.native
  
  var source: Buildspec = js.native
  
  var `source-version`: String = js.native
  
  var `timeout-in-minutes`: Double = js.native
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
  
  @scala.inline
  implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifact(value: Location): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBuild-complete`(value: Boolean): Self = StObject.set(x, "build-complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBuild-number`(value: Double): Self = StObject.set(x, "build-number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBuild-start-time`(value: String): Self = StObject.set(x, "build-start-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: Type): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Computetype): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: Deeplink): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhases(value: js.Array[Durationinseconds]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhasesVarargs(value: Durationinseconds*): Self = StObject.set(x, "phases", js.Array(value :_*))
    
    @scala.inline
    def `setProject-file-system-locations`(value: js.Array[js.Any]): Self = StObject.set(x, "project-file-system-locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setProject-file-system-locationsVarargs`(value: js.Any*): Self = StObject.set(x, "project-file-system-locations", js.Array(value :_*))
    
    @scala.inline
    def `setQueued-timeout-in-minutes`(value: Double): Self = StObject.set(x, "queued-timeout-in-minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Buildspec): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-version`(value: String): Self = StObject.set(x, "source-version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTimeout-in-minutes`(value: Double): Self = StObject.set(x, "timeout-in-minutes", value.asInstanceOf[js.Any])
  }
}
