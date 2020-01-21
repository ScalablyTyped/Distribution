package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.fetch
import typings.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.flatten
import typings.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.parallel
import typings.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QueryPlanNode. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode")
@js.native
/**
  * Constructs a new QueryPlanNode.
  * @param [properties] Properties to set
  */
class QueryPlanNode_ () extends IQueryPlanNode {
  def this(properties: IQueryPlanNode) = this()
  /** QueryPlanNode node. */
  var node: js.UndefOr[sequence | parallel | fetch | flatten] = js.native
  /**
    * Converts this QueryPlanNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

